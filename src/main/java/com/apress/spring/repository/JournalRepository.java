package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apress.spring.domain.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry, Long>{}
