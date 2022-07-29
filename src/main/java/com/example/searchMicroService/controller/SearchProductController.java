package com.example.searchMicroService.controller;

import com.example.searchMicroService.entity.Product;
import com.example.searchMicroService.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/")
public class SearchProductController
{
    @Autowired
    SearchRepository searchRepository;


    @PostMapping("/saveAllProduct")
    public int createAllProducts (@RequestBody List<Product> products)
    {
        searchRepository.saveAll(products);
        return products.size();
    }

    @PostMapping("/saveOne")
    public Product createOneProduct (@RequestBody Product product)
    {
        return searchRepository.save(product);
    }

    @GetMapping(value = "/findAll")
    public Iterable<Product> findAllProducts()
    {
        return searchRepository.findAll();
    }

    @GetMapping(value = "/findBySearch/{name}")
    public Iterable<Product> findBySearch(@PathVariable("name") String name)
    {
        return searchRepository.findByName(name);
    }
}
