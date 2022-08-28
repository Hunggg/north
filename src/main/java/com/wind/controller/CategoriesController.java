package com.wind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wind.entity.Categories;
import com.wind.service.CategoriesService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CategoriesController {
    @Autowired private CategoriesService categoriesService;

    @GetMapping("/")
    public List<Categories> getAllUser() {
        return categoriesService.getList();
    }

    @PostMapping("/categories")
    public Categories saveCategories(@RequestBody Categories categories) {
        return categoriesService.save(categories);
    }

    @GetMapping("/categories/{id}")
    public Categories getCategoriesById(@PathVariable Long id) {
        if (categoriesService.getById(id).isPresent()) {
            return categoriesService.getById(id).get();
        }
        return null;
    }

    @DeleteMapping("categories/delete/{id}")
    public void putCategories(@PathVariable Long id) {
        categoriesService.delete(id);
    }
}
