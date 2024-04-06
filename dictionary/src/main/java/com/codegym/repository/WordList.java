package com.codegym.repository;

import java.util.HashMap;
import java.util.Map;

public class WordList {
    private static Map<String, String> wordList = new HashMap<>();

    static {
        wordList.put("Hello",
                "Xin chao");
        wordList.put("Hi",
                "Chao");
        wordList.put("Money",
                "Tien");
        wordList.put("Goodbye",
                "Tam biet");
    }

    public static Map<String, String> getWordList() {
        return wordList;
    }

    public static void setWordList(Map<String, String> wordList) {
        WordList.wordList = wordList;
    }
}
