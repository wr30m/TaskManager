package com.example.kirazavrik.taskmanager.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kirazavrik.taskmanager.R;

public class NewTaskActivity extends AppCompatActivity {

    public EditText text;
    public Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        text = (EditText) findViewById(R.id.newTaskText);
        okButton = (Button) findViewById(R.id.okBtn);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void onSubmit() {
        Intent intent = new Intent();

        intent.putExtra("text", text.getText().toString());
        setResult(RESULT_OK, intent);

        finish();
    }
}
