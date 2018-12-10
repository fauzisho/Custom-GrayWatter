package com.graywater.customgraywater.activityview;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.graywater.customgraywater.R;


public class ActivityItemHolder extends RecyclerView.ViewHolder {
    public AppCompatImageView activityImg;
    public AppCompatTextView captionTxt;
    public AppCompatTextView numReviewTxt;
    public AppCompatRatingBar rateView;

    public ActivityItemHolder(View itemView) {
        super(itemView);
        activityImg = itemView.findViewById(R.id.activity_img);
        captionTxt = itemView.findViewById(R.id.activity_caption);
        numReviewTxt = itemView.findViewById(R.id.activity_num_reviews);
        rateView = itemView.findViewById(R.id.activity_rate);
    }
}
