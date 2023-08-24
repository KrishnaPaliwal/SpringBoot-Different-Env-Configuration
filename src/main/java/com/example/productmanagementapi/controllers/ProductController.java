package com.example.productmanagementapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmanagementapi.models.Product;
import com.example.productmanagementapi.repositories.ProductRepository;

//ProductController.java
@RestController
@RequestMapping("/api/products")
public class ProductController {
 @Autowired
 private ProductRepository productRepository;
 
 @GetMapping
 public List<Product> getAllProducts() {
     return productRepository.findAll();
 }
 
 @PostMapping
 public Product addProduct(@RequestBody Product product) {
     return productRepository.save(product);
 }
}
