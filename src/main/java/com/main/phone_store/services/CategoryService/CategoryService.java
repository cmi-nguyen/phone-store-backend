package com.main.phone_store.services.CategoryService;


import com.main.phone_store.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category saveCategory(Category category);

    // Read  list operation
    List<Category> fetchCategoryList();

    // Read  by id
    Optional<Category> getCategoryByID(int category_id);
    // Update operation
    Category updateCategory(Category category, int category_id);

    // Delete operation
    void deleteCategory( int category_id);
}
