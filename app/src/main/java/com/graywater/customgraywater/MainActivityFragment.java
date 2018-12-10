package com.graywater.customgraywater;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.graywater.customgraywater.component.model.Activities;
import com.graywater.customgraywater.component.model.Activity;
import com.graywater.customgraywater.component.model.ActivityWithHead;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView list = view.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        list.setItemAnimator(new DefaultItemAnimator());

        HomeAdapter adapter = new HomeAdapter(getActivity());

        List<Activity> activities = new ArrayList<Activity>() {
            {
                add(new Activity(R.drawable.bg, "$90 Culinary Tour Face of Five Foot Stall", 5, 60));
                add(new Activity(R.drawable.bg, "$90 Culinary Tour Face of Five Foot Stall1", 4, 10));
                add(new Activity(R.drawable.bg, "$90 Culinary Tour Face of Five Foot Stall2", 3, 30));
                add(new Activity(R.drawable.bg, "$90 Culinary Tour Face of Five Foot Stall3", 2, 5));
                add(new Activity(R.drawable.bg, "$90 Culinary Tour Face of Five Foot Stall4", 3, 20));
            }
        };

        adapter.add(new Activities(activities));
        adapter.add(new ActivityWithHead("Top Activities", "SEE MORE", activities));
        list.setAdapter(adapter);
    }
}
