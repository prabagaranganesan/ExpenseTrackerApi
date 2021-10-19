package com.prabhalearning.expensetrackerapi.services;

import com.prabhalearning.expensetrackerapi.domain.Category;
import com.prabhalearning.expensetrackerapi.exceptions.EtBadRequestException;
import com.prabhalearning.expensetrackerapi.exceptions.EtResourceNotFoundException;
import com.prabhalearning.expensetrackerapi.resource.CategoryResource;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategory(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
