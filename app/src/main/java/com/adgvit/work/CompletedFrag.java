package com.adgvit.work;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CompletedFrag extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.completed_frag, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.completedList);
        adapter = new RecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private List<Item> getData() {
        List<Item> data = new ArrayList<>();
        String[] dates = {"01/01", "02/02", "03/03", "04/04", "05/05", "06/06", "07/07"};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] tasks = {"Permission", "Desk duty", "Poster", "Meeting", "Messaging", "Make design", "Report to abc"};
        String[] names = {"A", "B", "C", "D", "E", "F", "G"};
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
