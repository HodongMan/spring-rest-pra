package com.apress.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apress.spring.repository.JournalRepository;
import com.apress.spring.domain.JournalEntry;


@RestController
public class JournalController {

    private static final String VIEW_INDEX = "index";

    @Autowired
    JournalRepository repo;

    @GetMapping("/")
    public List<JournalEntry> index() {
        List<JournalEntry> journalList = repo.findAll();
        return journalList;
    }
}