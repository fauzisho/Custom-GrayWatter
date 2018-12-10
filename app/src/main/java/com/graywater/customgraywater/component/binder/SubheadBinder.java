package com.graywater.customgraywater.component.binder;

import android.support.annotation.NonNull;

import com.graywater.customgraywater.component.holder.SubheadHolder;
import com.graywater.customgraywater.component.model.BaseModel;
import com.graywater.customgraywater.custom.MultiListAdapter;

import java.util.List;



public class SubheadBinder<U extends BaseModel.Head> implements MultiListAdapter.Binder<U, SubheadHolder> {
    @NonNull
    @Override
    public Class<SubheadHolder> getViewHolderType() {
        return SubheadHolder.class;
    }

    @Override
    public void prepare(@NonNull U model, List<MultiListAdapter.Binder<? super U, ? extends SubheadHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull U model, @NonNull SubheadHolder holder, @NonNull List<MultiListAdapter.Binder<? super U, ? extends SubheadHolder>> binders, int binderIndex, @NonNull MultiListAdapter.ActionListener<U, SubheadHolder> actionListener) {
        holder.title.setText(model.getTitle());
        holder.moreBtn.setText(model.getButtonText());
    }

    @Override
    public void unbind(@NonNull SubheadHolder holder) {

    }
}
