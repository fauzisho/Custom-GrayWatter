package com.graywater.customgraywater.component.creator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.component.holder.ActivityHolder;
import com.graywater.customgraywater.custom.MultiListAdapter;

public class ActivityHolderCreator implements MultiListAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new ActivityHolder(MultiListAdapter.inflate(parent, R.layout.top_activities_layout));
    }

    @Override
    public int getViewType() {
        return R.layout.top_activities_layout;
    }
}
