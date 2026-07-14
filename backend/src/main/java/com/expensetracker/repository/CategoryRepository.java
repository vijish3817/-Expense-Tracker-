package com.expensetracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensetracker.entity.Category;
import com.expensetracker.entity.TransactionType;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByType(TransactionType type);
    boolean existsByName(String name);
    java.util.Optional<Category> findByName(String name);
}
