package com.why.constraint.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.why.constraint.ItemDecoration.VerticalItemDecoration;
import com.why.constraint.R;
import com.why.constraint.adapter.FunAdapter;
import com.why.constraint.entity.FunEntity;
import com.why.constraint.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Why on 2021/6/21.
 *
 * @see <a href="https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout">ConstraintLayout官方文档</a>
 */
public class MainActivity extends AppCompatActivity {
    private List<FunEntity> funEntityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    public void initData() {
        funEntityList = new ArrayList<>();
        funEntityList.add(new FunEntity("相对位置", RelativePositioningExampleActivity.class));
        funEntityList.add(new FunEntity("宽高大小", WidthHeightExampleActivity.class));
        funEntityList.add(new FunEntity("宽高百分比大小", PercentDimensionsExampleActivity.class));
        funEntityList.add(new FunEntity("宽高default Min Max", DefaultMinMaxExampleActivity.class));
        funEntityList.add(new FunEntity("宽高比例", RatioExampleActivity.class));
        funEntityList.add(new FunEntity("Margin与goneMargin", MarginExampleActivity.class));
        funEntityList.add(new FunEntity("Bias", BiasExampleActivity.class));
        funEntityList.add(new FunEntity("角度布局", CircularPositioningExampleActivity.class));
        funEntityList.add(new FunEntity("Chain", ChainExampleActivity.class));
        funEntityList.add(new FunEntity("GuideLine", GuideLineExampleActivity.class));
        funEntityList.add(new FunEntity("Barrier", BarrierExampleActivity.class));
        funEntityList.add(new FunEntity("Group", GroupExampleActivity.class));
        funEntityList.add(new FunEntity("PlaceHolder", PlaceHolderExampleActivity.class));
        funEntityList.add(new FunEntity("Layer", LayerExampleActivity.class));
        funEntityList.add(new FunEntity("Flow", FlowExampleActivity.class));
        funEntityList.add(new FunEntity("ConstraintSet", ConstraintSetExampleActivity.class));
    }

    public void initView() {
        RecyclerView recyclerView = findViewById(R.id.id_recycler_view);
        recyclerView.addItemDecoration(new VerticalItemDecoration(DensityUtil.dp2px(1)));
        recyclerView.setHasFixedSize(true);
        FunAdapter funAdapter = new FunAdapter(funEntityList);
        recyclerView.setAdapter(funAdapter);
    }
}
