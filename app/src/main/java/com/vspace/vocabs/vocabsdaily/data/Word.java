package com.vspace.vocabs.vocabsdaily.data;

/**
 * Created by Atul Verma on 09-12-2018.
 */

public class Word {
    private String word;
    private String[] anonyms;
    private String[] synonyms;
    private String example;

    public Word(String word, String[] anonyms, String[] synonyms, String example) {
        this.word = word;
        this.anonyms = anonyms;
        this.synonyms = synonyms;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String[] getAnonyms() {
        return anonyms;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public String getExample() {
        return example;
    }
}
