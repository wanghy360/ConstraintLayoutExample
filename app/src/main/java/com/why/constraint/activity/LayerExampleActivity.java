package com.why.constraint.activity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Layer;

import com.why.constraint.R;

/**
 * Created by Why on 2021/6/23.
 */
public class LayerExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer);
    }

    /**
     * alpha是Layer执行，scale,rotation,transaction是constraint_referenced_ids设置的每个控件执行
     */
    public void play(View view) {
        Layer layer = findViewById(R.id.layer);
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(layer, "alpha", 1.0f, 0.0f, 1.0f);
        alphaAnimator.setDuration(1000);
        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(layer, "rotation", 0.0f, 360.0f);
        rotationAnimator.setDuration(1000);
        alphaAnimator.start();
        rotationAnimator.start();
    }

    public void clickLayer(View view) {
        Toast.makeText(this, "点击了Layer", Toast.LENGTH_SHORT).show();
    }

    public void toggleVisibility(View view) {
        Layer layer = findViewById(R.id.layer);
        if (layer.getVisibility() == View.VISIBLE) {
            layer.setVisibility(View.GONE);
        } else {
            layer.setVisibility(View.VISIBLE);
        }
    }
}
