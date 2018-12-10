package com.graywater.customgraywater.component.holder;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.graywater.customgraywater.R;



public class TitleHolder extends BaseHolder {
    public AppCompatTextView title;

    public TitleHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
    }
}
