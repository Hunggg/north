package com.wind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wind.entity.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long> {
}
