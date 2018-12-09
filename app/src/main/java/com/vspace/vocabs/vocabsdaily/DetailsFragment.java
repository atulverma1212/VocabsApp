package com.vspace.vocabs.vocabsdaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Atul Verma on 09-12-2018.
 */

public class DetailsFragment extends Fragment {

    public DetailsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);
        TextView tv_mean = rootView.findViewById(R.id.word_mean);
        TextView tv_syn = rootView.findViewById(R.id.word_synonym);
        TextView tv_ant = rootView.findViewById(R.id.word_antonym);
        TextView tv_eg = rootView.findViewById(R.id.word_example);
        TextView tv_name = rootView.findViewById(R.id.word_name);

        int pos = getArguments().getInt("position");
        tv_name.setText("Item #" + pos);
        return rootView;
    }
}
