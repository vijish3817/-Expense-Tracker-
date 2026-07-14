package com.expensetracker.service;

import java.util.List;

import com.expensetracker.dto.request.BudgetRequest;
import com.expensetracker.dto.response.com.expensetracker.dto.response.BudgetResponse;
import com.expensetracker.entity.User;

public interface BudgetService {
    BudgetResponse createBudget(BudgetRequest request, User user);
    BudgetResponse updateBudget(Long id, BudgetRequest request, User user);
    void deleteBudget(Long id, User user);
    List<BudgetResponse> getBudgets(User user, Integer month, Integer year);
    BudgetResponse getBudget(Long id, User user);
}
