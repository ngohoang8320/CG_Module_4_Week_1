package com.codegym.model;

public class Word {
    private String originWord;
    private String meaning;

    public Word() {
    }

    public Word(String originWord,
                String meaning) {
        this.originWord = originWord;
        this.meaning = meaning;
    }

    public String getOriginWord() {
        return originWord;
    }

    public void setOriginWord(String originWord) {
        this.originWord = originWord;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
