package com.graywater.customgraywater.component.creator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.component.holder.DiaryHolder;
import com.graywater.customgraywater.custom.MultiListAdapter;



public class DiaryHolderCreator implements MultiListAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new DiaryHolder(MultiListAdapter.inflate(parent, R.layout.diary_layout));
    }

    @Override
    public int getViewType() {
        return R.layout.diary_layout;
    }
}
