package com.adgvit.work;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PendingFrag extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pending_frag, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.pendingList);
        adapter = new RecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    private List<Item> getData() {
        List<Item> data = new ArrayList<>();
        String[] dates = {"DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY",};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] names = {"Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member"};
        String[] tasks = {"Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted"};
        for(int i = 0; i < names.length; i++) {
            Item current = new Item();
            current.Date = dates[i];
            current.Day = days[i];
            current.Name = names[i];
            current.Work = tasks[i];
            data.add(current);
        }
        return data;
    }
}
