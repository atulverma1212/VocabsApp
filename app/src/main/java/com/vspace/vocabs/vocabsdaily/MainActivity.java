package com.vspace.vocabs.vocabsdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;

import com.vspace.vocabs.vocabsdaily.adapters.MainAdapter;
import com.vspace.vocabs.vocabsdaily.data.DataAsset;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.search_bar)
    EditText searchBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.daily_word_card)
    public void onClickDailyWords(){
        Intent intent = new Intent(this, WordsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.search_bar_cross)
    public void onClickSearchCross(){
        searchBar.setText("");
    }
}
