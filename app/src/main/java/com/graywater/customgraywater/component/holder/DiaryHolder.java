package com.graywater.customgraywater.component.holder;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.graywater.customgraywater.R;
import com.graywater.customgraywater.custom.CircleImageView;




public class DiaryHolder extends BaseHolder {
    public AppCompatImageView diaryImg;
    public CircleImageView profileImg;
    public AppCompatTextView nameTxt;
    public AppCompatTextView captionTxt;
    public AppCompatTextView locationTxt;
    public AppCompatImageView shareBtn;
    public AppCompatImageView bookmarkBtn;

    public DiaryHolder(View itemView) {
        super(itemView);
        diaryImg = itemView.findViewById(R.id.diary_img);
        profileImg = itemView.findViewById(R.id.profile_img);
        nameTxt = itemView.findViewById(R.id.profile_name_txt);
        locationTxt = itemView.findViewById(R.id.diary_location_txt);
        shareBtn = itemView.findViewById(R.id.share_btn);
        bookmarkBtn = itemView.findViewById(R.id.bookmark_btn);
        captionTxt = itemView.findViewById(R.id.caption_txt);
    }
}
