package com.why.constraint.ItemDecoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


/**
 * Created by Why on 2021/6/21.
 */
public class VerticalItemDecoration extends RecyclerView.ItemDecoration {
    private final int spaceBetweenItem;
    private final int firstTopSpace;

    public VerticalItemDecoration(int spaceBetweenItem) {
        this(0, spaceBetweenItem);
    }

    public VerticalItemDecoration(int firstTopSpace, int spaceBetweenItem) {
        this.spaceBetweenItem = spaceBetweenItem;
        this.firstTopSpace = firstTopSpace;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position = parent.getChildAdapterPosition(view);
        if (position == 0) {
            outRect.top = firstTopSpace;
        } else {
            outRect.top = spaceBetweenItem;
        }
    }
}
