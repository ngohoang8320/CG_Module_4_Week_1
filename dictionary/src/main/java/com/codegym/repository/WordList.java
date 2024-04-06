package com.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class WordList implements WordListRepo {
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

    @Override
    public String find(String word) {
        String result = wordList.get(word);
        if (result != null) {
            return result;
        }
        return "Not found";
    }
}
