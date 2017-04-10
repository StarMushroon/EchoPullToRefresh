package com.xiao.echopulltorefresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements PullToRefreshBase.OnRefreshListener {

    private String str = "this is for test";

    private static String TAG = MainActivity.class.getSimpleName();

    private PullToRefreshListView mListView;
    private ArrayList<Data.段子Bean> mList;
    private DuanziAdapter mAdapter;

    private Retrofit mRetrofit;
    private RetrofitInterface mInterface;
    private ILoadingLayout mLayoutProxy;

    private String baseUrl = "http://c.3g.163.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        loadData();
        setData();
    }

    private void initView() {
        mListView = (PullToRefreshListView) findViewById(R.id.pullListView_main);
    }

    private void initData() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mInterface = mRetrofit.create(RetrofitInterface.class);
        mList = new ArrayList<>();
        mAdapter = new DuanziAdapter(mList, this);
    }

    //解析获取数据
    private void loadData() {
        mInterface.getData().enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.isSuccessful()) {
                    Data body = response.body();
                    mList.addAll(body.get段子());
                    mAdapter.notifyDataSetChanged();

                    Toast.makeText(MainActivity.this, "mList.size():"+mList.size(), Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });

    }

    private void setData() {
        mListView.setAdapter(mAdapter);
        mListView.setOnRefreshListener(this);

        //设置头部的刷新
        mLayoutProxy = mListView.getLoadingLayoutProxy(true, false);
        mLayoutProxy.setPullLabel("下拉获取最新内容");
        mLayoutProxy.setReleaseLabel("松开");
        String lastTime = DateUtils.formatDateTime(this,System.currentTimeMillis(),
                DateUtils.FORMAT_ABBREV_TIME|DateUtils.FORMAT_SHOW_DATE|DateUtils.FORMAT_SHOW_TIME);
        mLayoutProxy.setLastUpdatedLabel(lastTime);
    }

   /* //下拉刷新
    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        loadData();
    }

    //上拉加载
    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {

    }*/

    @Override
    public void onRefresh(PullToRefreshBase refreshView) {
        mList.clear();
        loadData();
    }
}
