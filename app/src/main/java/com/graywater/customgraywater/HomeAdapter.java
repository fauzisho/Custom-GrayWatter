package com.graywater.customgraywater;

import android.content.Context;

import com.graywater.customgraywater.component.binder.ActivityBinder;
import com.graywater.customgraywater.component.binder.ActivityWithHeadBinder;
import com.graywater.customgraywater.component.binder.SubheadBinder;
import com.graywater.customgraywater.component.binderitem.ActivityItemBinder;
import com.graywater.customgraywater.component.binderitem.ActivityWithHeadItemBinder;
import com.graywater.customgraywater.component.creator.ActivityHolderCreator;
import com.graywater.customgraywater.component.creator.DiaryHolderCreator;
import com.graywater.customgraywater.component.creator.SubheadHolderCreator;
import com.graywater.customgraywater.component.creator.TitleHolderCreator;
import com.graywater.customgraywater.component.holder.ActivityHolder;
import com.graywater.customgraywater.component.holder.BaseHolder;
import com.graywater.customgraywater.component.holder.DiaryHolder;
import com.graywater.customgraywater.component.holder.SubheadHolder;
import com.graywater.customgraywater.component.holder.TitleHolder;
import com.graywater.customgraywater.component.model.Activities;
import com.graywater.customgraywater.component.model.ActivityWithHead;
import com.graywater.customgraywater.component.model.BaseModel;
import com.graywater.customgraywater.custom.MultiListAdapter;

public class HomeAdapter extends MultiListAdapter<BaseModel, BaseHolder, Class<? extends BaseModel>> {
    public HomeAdapter(Context context) {
        register(new TitleHolderCreator(), TitleHolder.class);
        register(new SubheadHolderCreator(), SubheadHolder.class);
        register(new DiaryHolderCreator(), DiaryHolder.class);
        register(new ActivityHolderCreator(), ActivityHolder.class);

        ActivityBinder activityBinder = new ActivityBinder(context);
        ActivityItemBinder activityItemBinder = new ActivityItemBinder(activityBinder);

        SubheadBinder<ActivityWithHead> subheadBinder = new SubheadBinder<>();
        ActivityWithHeadBinder activityWithHeadBinder = new ActivityWithHeadBinder(context);
        ActivityWithHeadItemBinder activityWithHeadItemBinder = new ActivityWithHeadItemBinder(subheadBinder, activityWithHeadBinder);

        register(Activities.class, activityItemBinder, null);
        register(ActivityWithHead.class, activityWithHeadItemBinder, null);
    }

    @Override
    protected Class<? extends BaseModel> getModelType(BaseModel model) {
        return model.getClass();
    }
}
