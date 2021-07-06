package com.why.constraint.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.why.constraint.R;

/**
 * Created by Why on 2021/6/23.
 */
public class MarginExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_margin);
    }

    public void hideF(View view) {
        View F = findViewById(R.id.F);
        int visibilityOfF = F.getVisibility();
        F.setVisibility(visibilityOfF == View.GONE ? View.VISIBLE : View.GONE);
    }
}
