package com.graywater.customgraywater.component.binderitem;

import android.support.annotation.NonNull;

import com.graywater.customgraywater.component.binder.ActivityWithHeadBinder;
import com.graywater.customgraywater.component.binder.SubheadBinder;
import com.graywater.customgraywater.component.holder.BaseHolder;
import com.graywater.customgraywater.component.model.ActivityWithHead;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityWithHeadItemBinder implements MultiListAdapter.ItemBinder<ActivityWithHead, BaseHolder> {
    private SubheadBinder<ActivityWithHead> subheadBinder;
    private ActivityWithHeadBinder activityBinder;

    public ActivityWithHeadItemBinder(SubheadBinder<ActivityWithHead> subheadBinder, ActivityWithHeadBinder activityBinder) {
        this.subheadBinder = subheadBinder;
        this.activityBinder = activityBinder;
    }

    @NonNull
    @Override
    public List<MultiListAdapter.Binder<? super ActivityWithHead, ? extends BaseHolder>> getBinderList(@NonNull ActivityWithHead model, int position) {
        return new ArrayList<MultiListAdapter.Binder<? super ActivityWithHead, ? extends BaseHolder>>() {
            {
                add(subheadBinder);
                add(activityBinder);
            }
        };
    }
}
