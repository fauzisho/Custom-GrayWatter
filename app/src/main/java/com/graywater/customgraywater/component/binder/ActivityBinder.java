package com.graywater.customgraywater.component.binder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.graywater.customgraywater.activityview.ActivityAdapter;
import com.graywater.customgraywater.component.holder.ActivityHolder;
import com.graywater.customgraywater.component.model.Activities;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.List;


public class ActivityBinder implements MultiListAdapter.Binder<Activities, ActivityHolder> {

    private Context context;

    public ActivityBinder(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Class<ActivityHolder> getViewHolderType() {
        return ActivityHolder.class;
    }

    @Override
    public void prepare(@NonNull Activities model, List<MultiListAdapter.Binder<? super Activities, ? extends ActivityHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull Activities model, @NonNull ActivityHolder holder, @NonNull List<MultiListAdapter.Binder<? super Activities, ? extends ActivityHolder>> binders, int binderIndex, @NonNull MultiListAdapter.ActionListener<Activities, ActivityHolder> actionListener) {
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
