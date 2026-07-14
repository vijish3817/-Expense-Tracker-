package com.expensetracker.service;

import java.util.List;

import com.expensetracker.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
}
