package com.example.kirazavrik.taskmanager.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kirazavrik.taskmanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlannedTasksFragment extends Fragment {


    public PlannedTasksFragment() {
        // Required empty public constructor
    }

    public static PlannedTasksFragment newInstance() {
        PlannedTasksFragment plannedTasksFragment = new PlannedTasksFragment();
        return plannedTasksFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.plannedRv);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planned_tasks, container, false);
    }

}
