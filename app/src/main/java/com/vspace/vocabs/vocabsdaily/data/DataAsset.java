package com.vspace.vocabs.vocabsdaily.data;

import com.vspace.vocabs.vocabsdaily.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Atul Verma on 08-12-2018.
 */

public class DataAsset {
    private static final String[] mainList = new String[]{
            "Words of the day",
            "Dictionary",
            "Saved Words"
    };

    private static final String[] wordList = new String[]{
            "Words of the day",
            "Dictionary",
            "Saved Words",
            "Hello",
            "Words of the day",
            "Dictionary",
            "Saved Words",
            "Hello"
    };

    public static String[] getMainList() {
        return mainList;
    }

    public static String[] getWordList() {
        return wordList;
    }
}
