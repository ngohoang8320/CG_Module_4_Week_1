package com.codegym.service;

import com.codegym.repository.WordList;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String findWord(String word) {
        Map<String, String> wordList = WordList.getWordList();
        String result = wordList.get(word);
        if (result != null) {
            return result;
        }
        return "Not found";
    }
}
