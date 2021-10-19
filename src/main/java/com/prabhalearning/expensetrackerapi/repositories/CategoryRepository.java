package com.prabhalearning.expensetrackerapi.repositories;

import com.prabhalearning.expensetrackerapi.domain.Category;
import com.prabhalearning.expensetrackerapi.exceptions.EtBadRequestException;
import com.prabhalearning.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;
    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Integer create(Integer userId, String title, String description) throws EtBadRequestException;
    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    void removeById(Integer userId, Integer categoryId);
}
