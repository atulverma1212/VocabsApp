package com.vspace.vocabs.vocabsdaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vspace.vocabs.vocabsdaily.adapters.MainAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Atul Verma on 09-12-2018.
 */

public class WordsFragment extends Fragment implements MainAdapter.MainListItemClickListener{
    private String[] mWords;
    private Toast mToast;
    private OnWordSelectListener mCallback;

    public WordsFragment() {
    }

    public interface OnWordSelectListener {
        public void onWordClick(int position);
    }

    public void setOnWordSelectListener(OnWordSelectListener mCallback) {
        this.mCallback = mCallback;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_words, container, false);
        mWords = getArguments().getStringArray("Words");
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_words);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new MainAdapter(mWords, this));
        return rootView;
    }

    @Override
    public void onMainListClick(int clickedItem) {
        String msg = "Item #" + clickedItem + " clicked!";
        Log.e("Item clicked", msg);
        mToast = Toast.makeText(this.getContext(), msg, Toast.LENGTH_SHORT);
        mToast.show();
        mCallback.onWordClick(clickedItem);
    }
}
