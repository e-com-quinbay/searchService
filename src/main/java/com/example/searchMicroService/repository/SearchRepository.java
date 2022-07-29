package com.example.searchMicroService.repository;

import com.example.searchMicroService.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchRepository extends ElasticsearchRepository<Product, String> {

    Iterable<Product> findByName(String slug);

}
