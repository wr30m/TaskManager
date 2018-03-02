package com.example.kirazavrik.taskmanager.model;

import java.util.Date;

/**
 * Created by kirazavrik on 23.2.18.
 */

public class Task {

    private String taskTest;

    private Date date;

    public String getTaskTest() {
        return taskTest;
    }

    public void setTaskTest(String taskTest) {
        this.taskTest = taskTest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
