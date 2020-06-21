package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostView extends AppCompatActivity {

    Button groupsBtn, compBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_view);

        groupsBtn = findViewById(R.id.groups_button);
        compBtn = findViewById(R.id.competetion_button);

        groupsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PostView.this, GroupsList.class));
            }
        });

        compBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PostView.this, Competitions.class));
            }
        });
    }
}
