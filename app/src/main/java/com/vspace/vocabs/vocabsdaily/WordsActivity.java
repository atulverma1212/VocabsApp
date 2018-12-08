
package com.vspace.vocabs.vocabsdaily;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.vspace.vocabs.vocabsdaily.adapters.MainAdapter;
import com.vspace.vocabs.vocabsdaily.data.DataAsset;

public class WordsActivity extends AppCompatActivity implements MainAdapter.MainListItemClickListener, WordsFragment.OnWordSelectListener {
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        Bundle args = new Bundle();
        args.putStringArray("Words", DataAsset.getWordList());

        WordsFragment wordsFragment = new WordsFragment();
        wordsFragment.setArguments(args);
        wordsFragment.setOnWordSelectListener(this);
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.words_fragment_container, wordsFragment)
                .commit();
    }

    @Override
    public void onMainListClick(int clickedItem) {
        String msg = "Item #" + clickedItem + " clicked!";
        Log.e("Item clicked", msg);
        mToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        mToast.show();
    }

    @Override
    public void onWordClick(int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);
        DetailsFragment detailsFragment = new DetailsFragment();
        detailsFragment.setArguments(args);
        FragmentTransaction txn = getSupportFragmentManager().beginTransaction();
        txn.replace(R.id.words_fragment_container, detailsFragment);
        txn.addToBackStack(null);
        txn.commit();
    }
}
