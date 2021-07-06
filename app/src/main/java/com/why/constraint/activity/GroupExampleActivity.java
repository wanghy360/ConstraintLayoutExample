package com.why.constraint.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.why.constraint.R;

/**
 * Created by Why on 2021/6/23.
 */
public class GroupExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
    }

    public void toggleGroup(View view) {
        View group = findViewById(R.id.ab_group);
        group.setVisibility(group.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }
}
