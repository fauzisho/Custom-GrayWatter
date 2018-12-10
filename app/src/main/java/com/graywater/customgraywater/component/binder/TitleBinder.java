package com.graywater.customgraywater.component.binder;

import android.support.annotation.NonNull;

import com.graywater.customgraywater.component.holder.TitleHolder;
import com.graywater.customgraywater.component.model.BaseModel;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.List;



public class TitleBinder<U extends BaseModel.Title> implements MultiListAdapter.Binder<U, TitleHolder> {
    @NonNull
    @Override
    public Class<TitleHolder> getViewHolderType() {
        return TitleHolder.class;
    }

    @Override
    public void prepare(@NonNull U model, List<MultiListAdapter.Binder<? super U, ? extends TitleHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull U model, @NonNull TitleHolder holder, @NonNull List<MultiListAdapter.Binder<? super U, ? extends TitleHolder>> binders, int binderIndex, @NonNull MultiListAdapter.ActionListener<U, TitleHolder> actionListener) {
        holder.title.setText(model.getTitle());
    }

    @Override
    public void unbind(@NonNull TitleHolder holder) {

    }
}
