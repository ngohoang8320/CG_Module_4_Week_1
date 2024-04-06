package com.codegym.service;

import com.codegym.repository.WordListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private WordListRepo wordList;

    @Override
    public String findWord(String word) {
        String result = wordList.find(word);
        return result;
    }
}
