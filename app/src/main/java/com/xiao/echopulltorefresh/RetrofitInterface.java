package com.xiao.echopulltorefresh;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by StarMushroom on 2017/4/8.
 */

public interface RetrofitInterface {


    @GET("recommend/getChanRecomNews?channel=duanzi&passport=&devId=09109B37-37DB-4DA9-B6BF-36252EBBEDAB&size=20")
    Call<Data> getData();
}
