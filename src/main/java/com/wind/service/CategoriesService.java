package com.wind.service;

import java.util.List;
import java.util.Optional;

import com.wind.entity.Categories;

public interface CategoriesService {
    List<Categories> getList();
    Categories save(Categories categories);
    void delete(Long id);
    Optional<Categories> getById(Long id);
}
