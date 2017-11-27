package com.smewise.camera2.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.smewise.camera2.R;


/**
 * Created by wenzhe on 11/22/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private PreferenceGroup mGroup;
    private Context mContext;

    public ListAdapter(Context context, PreferenceGroup group) {
        mContext = context;
        mGroup = group;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.option_item_layout, parent,
                false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.itemText.setText(mGroup.get(position).getTitle());
        holder.itemIcon.setBackgroundResource(mGroup.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return mGroup.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        Button itemIcon;
        TextView itemText;
        MyViewHolder(View itemView) {
            super(itemView);
            itemIcon = (Button) itemView.findViewById(R.id.item_icon);
            itemText = (TextView) itemView.findViewById(R.id.item_text);
        }
    }

}
