package com.tito.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.security.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
