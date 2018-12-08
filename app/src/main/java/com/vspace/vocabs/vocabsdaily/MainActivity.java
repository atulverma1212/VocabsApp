package com.vspace.vocabs.vocabsdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vspace.vocabs.vocabsdaily.adapters.MainAdapter;
import com.vspace.vocabs.vocabsdaily.data.DataAsset;

public class MainActivity extends AppCompatActivity implements MainAdapter.MainListItemClickListener{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_main);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new MainAdapter(DataAsset.getMainList(),this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onMainListClick(int clickedItem) {
        Intent intent = new Intent(this, WordsActivity.class);
        startActivity(intent);
    }
}
