package com.example.kirazavrik.taskmanager.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kirazavrik.taskmanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompletedTasksFragment extends Fragment {


    public CompletedTasksFragment() {
        // Required empty public constructor
    }

    public static CompletedTasksFragment newInstance() {
        CompletedTasksFragment completedTasksFragment = new CompletedTasksFragment();
        return completedTasksFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completed_tasks, container, false);
    }

}
