package com.graywater.customgraywater.component.creator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.component.holder.SubheadHolder;
import com.graywater.customgraywater.custom.MultiListAdapter;



public class SubheadHolderCreator implements MultiListAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new SubheadHolder(MultiListAdapter.inflate(parent, R.layout.subhead));
    }

    @Override
    public int getViewType() {
        return R.layout.subhead;
    }
}
