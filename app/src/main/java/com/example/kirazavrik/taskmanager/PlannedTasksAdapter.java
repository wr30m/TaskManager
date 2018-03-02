package com.example.kirazavrik.taskmanager;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.kirazavrik.taskmanager.model.Task;

import java.util.ArrayList;

/**
 * Created by kirazavrik on 1.3.18.
 */

public class PlannedTasksAdapter extends RecyclerView.Adapter<PlannedTasksAdapter.ViewHolder>{

    private MutableLiveData<ArrayList<Task>> tasks;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView plannedTaskDescription;
        public CheckBox plannedTaskCheckBox;

        public ViewHolder(View view) {
            super(view);

            plannedTaskDescription = view.findViewById(R.id.plannedTextView);
            plannedTaskCheckBox = view.findViewById(R.id.plannedCheckBox);
        }
    }

    public PlannedTasksAdapter(MutableLiveData<ArrayList<Task>> tasks, Context context) {
        this.tasks = tasks;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.planned_task_item,  parent,false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Task task = tasks.getValue().get(position);

        TextView textView = holder.plannedTaskDescription;
        textView.setText(task.getTaskTest());
    }

    @Override
    public int getItemCount() {
        return tasks.getValue().size();
    }
}
