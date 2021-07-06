package com.why.constraint.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.why.constraint.R;
import com.why.constraint.entity.FunEntity;

import java.util.List;


/**
 * Created by Why on 2021/6/21.
 */
public class FunAdapter extends RecyclerView.Adapter<FunAdapter.FunViewHolder> {
    @NonNull
    private List<FunEntity> dataList;

    public FunAdapter(List<FunEntity> dataList) {
        super();
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public FunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final Context Context = parent.getContext();
        final LayoutInflater layoutInflater = LayoutInflater.from(Context);
        final View itemView = layoutInflater.inflate(R.layout.adapter_fun, parent, false);
        final FunViewHolder funViewHolder = new FunViewHolder(itemView);
        itemView.setOnClickListener(v -> {
            final Context context = v.getContext();
            final int position = funViewHolder.getLayoutPosition();
            context.startActivity(new Intent(context, dataList.get(position).getClazz()));
        });
        return funViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FunViewHolder holder, int position) {
        holder.itemTv.setText(dataList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class FunViewHolder extends RecyclerView.ViewHolder {
        TextView itemTv;

        public FunViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTv = itemView.findViewById(R.id.tv_item);
        }
    }
}
