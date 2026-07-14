package com.expensetracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensetracker.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Optional<Budget> findByUserIdAndCategoryIdAndMonthAndYear(Long userId, Long categoryId, Integer month, Integer year);
    List<Budget> findByUserIdAndMonthAndYear(Long userId, Integer month, Integer year);
    List<Budget> findByMonthAndYear(Integer month, Integer year);
}
