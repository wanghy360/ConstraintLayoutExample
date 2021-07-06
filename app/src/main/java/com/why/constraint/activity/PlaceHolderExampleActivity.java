package com.why.constraint.activity;

import android.os.Bundle;
import android.transition.TransitionManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

import com.why.constraint.R;

/**
 * Created by Why on 2021/6/23.
 *
 * @see <a href="https://androidkt.com/constraintlayout">参考文章</a>
 * @see <a href="https://developer.android.com/reference/androidx/constraintlayout/widget/Placeholder">官方文档</a>
 * @see <a href="https://stackoverflow.com/questions/68206315">Button内容不能居中的bug</a>
 */
public class PlaceHolderExampleActivity extends AppCompatActivity {
    private Placeholder mainAction;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_holder);

        mainAction = (Placeholder) findViewById(R.id.template_action);
        constraintLayout = (ConstraintLayout) findViewById(R.id.root);

        findViewById(R.id.A).setOnClickListener(view -> {
            TransitionManager.beginDelayedTransition(constraintLayout);
            mainAction.setContentId(R.id.frameForA);
        });

        findViewById(R.id.B).setOnClickListener(view -> {
            TransitionManager.beginDelayedTransition(constraintLayout);
            mainAction.setContentId(view.getId());
        });
        findViewById(R.id.C).setOnClickListener(view -> {
            TransitionManager.beginDelayedTransition(constraintLayout);
            mainAction.setContentId(view.getId());
        });
        findViewById(R.id.D).setOnClickListener(view -> {
            TransitionManager.beginDelayedTransition(constraintLayout);
            mainAction.setContentId(view.getId());
        });
    }
}
