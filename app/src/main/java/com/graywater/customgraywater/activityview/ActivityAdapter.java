package com.graywater.customgraywater.activityview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.component.model.Activity;

import java.util.ArrayList;
import java.util.List;


public class ActivityAdapter extends RecyclerView.Adapter<ActivityItemHolder> {
    List<Activity> activities = new ArrayList<>();
    private Context context;

    public ActivityAdapter(Context context, List<Activity> activities) {
        this.context = context;
        this.activities = activities;
    }

    @Override
    public ActivityItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false);
        return new ActivityItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityItemHolder holder, int position) {
        Activity activity = activities.get(position);
        holder.activityImg.setImageResource(activity.getImage());
        holder.captionTxt.setText(activity.getInfo());
        holder.numReviewTxt.setText(activity.getTotalReviews() + " reviews");
        holder.rateView.setRating(activity.getRating());
    }

    @Override
    public int getItemCount() {
        return activities.size();
    }
}
