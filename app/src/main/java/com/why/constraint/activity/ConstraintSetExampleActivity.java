package com.why.constraint.activity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import com.why.constraint.R;

/**
 * Created by Why on 2021/6/21.
 */
public class ConstraintSetExampleActivity extends AppCompatActivity {

    private static final String SHOW_MODE2 = "show_mode_2";
    private boolean isShowMode2 = false;
    private ConstraintLayout constraintLayout;
    private final ConstraintSet constraintSet1 = new ConstraintSet();
    private final ConstraintSet constraintSet2 = new ConstraintSet();
    private TextView toggleDescTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_constraint_set_mode_1);

        constraintLayout = (ConstraintLayout) findViewById(R.id.root_view);
        constraintSet1.clone(constraintLayout);
        constraintSet2.load(this, R.layout.layout_constraint_set_mode_2);

        toggleDescTv = findViewById(R.id.toggle_desc);

        if (savedInstanceState != null) {
            boolean previous = savedInstanceState.getBoolean(SHOW_MODE2);
            if (previous != isShowMode2) {
                isShowMode2 = previous;
                applyConfig();
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(SHOW_MODE2, isShowMode2);
    }

    public void toggleMode(View v) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        isShowMode2 = !isShowMode2;
        applyConfig();
    }

    private void applyConfig() {
        if (isShowMode2) {
            constraintSet2.setVisibility(R.id.toggle_desc, toggleDescTv.getVisibility());//可以注释这句代码看下效果
            constraintSet2.applyTo(constraintLayout);
        } else {
            constraintSet1.setVisibility(R.id.toggle_desc, toggleDescTv.getVisibility());//可以注释这句代码看下效果
            constraintSet1.applyTo(constraintLayout);
        }
    }

    public void toggleDescVisibility(View view) {
        toggleDescTv.setVisibility(toggleDescTv.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }
}
