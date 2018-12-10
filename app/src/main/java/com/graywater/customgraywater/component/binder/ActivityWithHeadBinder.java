package com.graywater.customgraywater.component.binder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.graywater.customgraywater.activityview.ActivityAdapter;
import com.graywater.customgraywater.component.holder.ActivityHolder;
import com.graywater.customgraywater.component.model.ActivityWithHead;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.List;


public class ActivityWithHeadBinder implements MultiListAdapter.Binder<ActivityWithHead, ActivityHolder> {
    private Context context;

    public ActivityWithHeadBinder(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Class<ActivityHolder> getViewHolderType() {
        return ActivityHolder.class;
    }

    @Override
    public void prepare(@NonNull ActivityWithHead model, List<MultiListAdapter.Binder<? super ActivityWithHead, ? extends ActivityHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull ActivityWithHead model, @NonNull ActivityHolder holder, @NonNull List<MultiListAdapter.Binder<? super ActivityWithHead, ? extends ActivityHolder>> binders, int binderIndex, @NonNull MultiListAdapter.ActionListener<ActivityWithHead, ActivityHolder> actionListener) {
        RecyclerView list = holder.list;
        RecyclerView.LayoutManager manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        list.setHasFixedSize(false);
        list.setLayoutManager(manager);
        ActivityAdapter adapter = new ActivityAdapter(context, model.getActivities());
        list.setAdapter(adapter);
    }

    @Override
    public void unbind(@NonNull ActivityHolder holder) {

    }
}
