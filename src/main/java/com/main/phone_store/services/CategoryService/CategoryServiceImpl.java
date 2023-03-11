package com.main.phone_store.services.CategoryService;


import com.main.phone_store.entities.Category;
import com.main.phone_store.repositories.CategoryRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> fetchCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryByID(int category_id) {
        return categoryRepository.findById(category_id);
    }

    @Override
    public Category updateCategory(Category category, int category_id) {
        Category categoryDB = categoryRepository.findById(category_id).get();
        if (Objects.nonNull(category.getCategoryID())){
            categoryDB.setCategoryID(category.getCategoryID());
        }
        if  (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())){
            categoryDB.setCategoryName(category.getCategoryName());
        }
        if (Objects.nonNull(category.getDescription()) && !"".equalsIgnoreCase(category.getDescription())){
            categoryDB.setDescription(categoryDB.getDescription());
        }

        return saveCategory(categoryDB);
    }

    @Override
    public void deleteCategory(int category_id) {
        categoryRepository.deleteById(category_id);
    }
}
