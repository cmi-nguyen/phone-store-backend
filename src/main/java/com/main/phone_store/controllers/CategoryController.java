package com.main.phone_store.controllers;

import com.main.phone_store.entities.Category;
import com.main.phone_store.services.CategoryService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    @Autowired private CategoryService categoryService;
    @PostMapping("/category")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
    @GetMapping("/category")
    public List<Category> getCategoryList(){
        return categoryService.fetchCategoryList();
    }
    @GetMapping("/category/{id}")
    public Optional<Category> getCategoryByID(@PathVariable("id") int category_id){
        return categoryService.getCategoryByID(category_id);
    }
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable("id") int category_id){
        categoryService.deleteCategory(category_id);
    }
}
