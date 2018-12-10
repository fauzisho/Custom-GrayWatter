package com.graywater.customgraywater.component.binderitem;

import android.support.annotation.NonNull;

import com.graywater.customgraywater.component.binder.ActivityBinder;
import com.graywater.customgraywater.component.holder.BaseHolder;
import com.graywater.customgraywater.component.model.Activities;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.ArrayList;
import java.util.List;


public class ActivityItemBinder implements MultiListAdapter.ItemBinder<Activities, BaseHolder> {
    ActivityBinder binder;

    public ActivityItemBinder(ActivityBinder binder) {
        this.binder = binder;
    }

    @NonNull
    @Override
    public List<MultiListAdapter.Binder<? super Activities, ? extends BaseHolder>> getBinderList(@NonNull Activities model, int position) {
        return new ArrayList<MultiListAdapter.Binder<? super Activities, ? extends BaseHolder>>() {
            {
                add(binder);
            }
        };
    }
}
