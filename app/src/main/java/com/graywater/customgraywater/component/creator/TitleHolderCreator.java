package com.graywater.customgraywater.component.creator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.component.holder.TitleHolder;
import com.graywater.customgraywater.custom.MultiListAdapter;



public class TitleHolderCreator implements MultiListAdapter.ViewHolderCreator {

    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new TitleHolder(MultiListAdapter.inflate(parent, R.layout.title_layout));
    }

    @Override
    public int getViewType() {
        return R.layout.title_layout;
    }
}
