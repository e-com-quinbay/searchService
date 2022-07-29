package com.example.searchMicroService.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "productindex",shards = 2)
public class Product {

    @Id
    public String id;

    public Integer merchantId;
    public String name;

    public HashMap<String, String> additionalDetails = new HashMap<>();

    public Double price;
    public Integer stock;
    public String category;
    public String image[];

}
