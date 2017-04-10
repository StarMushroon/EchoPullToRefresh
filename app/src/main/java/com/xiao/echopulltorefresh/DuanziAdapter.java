package com.xiao.echopulltorefresh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by StarMushroom on 2017/4/8.
 */

public class DuanziAdapter extends BaseAdapter {

    private ArrayList<Data.段子Bean> mList;
    private Context mContext;

    public DuanziAdapter(ArrayList<Data.段子Bean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList==null?mList.size():0;
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView ==null){
            convertView = View.inflate(mContext,R.layout.item_list,null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.mTextView.setText(mList.get(position).getDigest());
        return convertView;
    }

    class ViewHolder{
        TextView mTextView;

        public ViewHolder(View view) {
            mTextView = (TextView) view.findViewById(R.id.tv_item_list);
        }
    }
}
