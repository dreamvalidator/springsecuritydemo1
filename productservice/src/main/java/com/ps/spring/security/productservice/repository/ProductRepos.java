package com.ps.spring.security.productservice.repository;

import com.ps.spring.security.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepos  extends JpaRepository<Product,Long> {
}
