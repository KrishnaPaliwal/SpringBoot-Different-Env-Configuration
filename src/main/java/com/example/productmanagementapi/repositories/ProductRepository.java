package com.example.productmanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productmanagementapi.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
