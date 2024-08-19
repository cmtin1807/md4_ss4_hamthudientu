package com.example.emailconfiguration.service;

import com.example.emailconfiguration.model.Languages;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguagesService {
    private static List<Languages> languagesList = new ArrayList<>();

    static {
        languagesList.add(new Languages(1, "English"));
        languagesList.add(new Languages(2, "Vietnamese"));
        languagesList.add(new Languages(3, "Japanese"));
        languagesList.add(new Languages(4, "Chinese"));
    }

    public List<Languages> findAll() {
        return languagesList;
    }
}
