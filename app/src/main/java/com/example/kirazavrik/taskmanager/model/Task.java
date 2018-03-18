package com.example.kirazavrik.taskmanager.model;

import java.util.Date;

/**
 * Created by kirazavrik on 23.2.18.
 */

public class Task {

    private String taskTest;


    public Task(String taskTest) {
        this.taskTest = taskTest;
    }

    public String getTaskTest() {
        return taskTest;
    }

    public void setTaskTest(String taskTest) {
        this.taskTest = taskTest;
    }

}
