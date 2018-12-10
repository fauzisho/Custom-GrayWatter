package com.graywater.customgraywater.component.holder;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.graywater.customgraywater.R;


public class SubheadHolder extends BaseHolder {
    public AppCompatTextView title;
    public AppCompatTextView moreBtn;

    public SubheadHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        moreBtn = itemView.findViewById(R.id.see_more_btn);
    }
}
