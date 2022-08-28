package com.wind.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wind.entity.Categories;
import com.wind.repository.CategoriesRepository;
import com.wind.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<Categories> getList() {
        return (List<Categories>) categoriesRepository.findAll();
    }

    @Override
    public Categories save(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public void delete(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public Optional<Categories> getById(Long id) {
        return categoriesRepository.findById(id);
    }

}
