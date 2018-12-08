package com.vspace.vocabs.vocabsdaily.adapters;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vspace.vocabs.vocabsdaily.MainActivity;
import com.vspace.vocabs.vocabsdaily.R;
import com.vspace.vocabs.vocabsdaily.WordsActivity;

/**
 * Created by Atul Verma on 08-12-2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private String[] mData;
    final private MainListItemClickListener mOnClickListener;

    public interface MainListItemClickListener {
        void onMainListClick(int clickedItem);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(mData[i]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public MainAdapter(String[] data, MainListItemClickListener clickListener) {
        mData = data;
        mOnClickListener = clickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
                                    implements View.OnClickListener{
        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.cv_data);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int itemClicked = getAdapterPosition();
            mOnClickListener.onMainListClick(itemClicked);
        }
    }
}
