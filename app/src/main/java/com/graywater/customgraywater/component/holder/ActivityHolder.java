package com.graywater.customgraywater.component.holder;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.graywater.customgraywater.R;



public class ActivityHolder extends BaseHolder {
    public AppCompatTextView moreBtn;
    public RecyclerView list;

    public ActivityHolder(View itemView) {
        super(itemView);
        moreBtn = itemView.findViewById(R.id.see_more_btn);
        list = itemView.findViewById(R.id.activities_list);
    }
}
