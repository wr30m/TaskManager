package com.example.kirazavrik.taskmanager.view;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kirazavrik.taskmanager.PlannedTasksAdapter;
import com.example.kirazavrik.taskmanager.R;
import com.example.kirazavrik.taskmanager.model.Task;
import com.example.kirazavrik.taskmanager.viewmodels.PlannedTasksViewModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlannedTasksFragment extends Fragment {

    public PlannedTasksViewModel tasksViewModel;
    public RecyclerView recyclerView;

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

        tasksViewModel = ViewModelProviders
                .of(this)
                .get(PlannedTasksViewModel.class);
        mock();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_planned_tasks, container, false);

        recyclerView = view.findViewById(R.id.plannedRv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        PlannedTasksAdapter adapter = new PlannedTasksAdapter(tasksViewModel.getListPlannedTasks());
        recyclerView.setAdapter(adapter);
        return view;
    }


    public void mock() {
        ArrayList<Task> tasks = new ArrayList<>();
        Task task = new Task("Hello");
        Task task1 = new Task("hgh");
        tasks.add(task);
        tasks.add(task1);
        tasksViewModel.getListPlannedTasks().setValue(tasks);
    }

}
