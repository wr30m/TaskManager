package com.example.kirazavrik.taskmanager.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.kirazavrik.taskmanager.model.Task;

import java.util.ArrayList;

/**
 * Created by kirazavrik on 2.3.18.
 */

public class PlannedTasksViewModel extends ViewModel {
    public MutableLiveData<ArrayList<Task>> listPlannedTasks;

    public MutableLiveData<ArrayList<Task>> getListPlannedTasks() {
        if (listPlannedTasks == null) {
            listPlannedTasks = new MutableLiveData<>();
        }
        return listPlannedTasks;
    }
}
