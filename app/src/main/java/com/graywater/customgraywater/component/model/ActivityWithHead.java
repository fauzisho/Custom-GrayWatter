package com.graywater.customgraywater.component.model;

import java.util.List;

public class ActivityWithHead implements BaseModel, BaseModel.Head {
    private String title;
    private String buttonLabel;
    private List<Activity> activities;

    public ActivityWithHead(String title, String buttonLabel, List<Activity> activities) {
        this.title = title;
        this.buttonLabel = buttonLabel;
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getButtonText() {
        return buttonLabel;
    }
}
