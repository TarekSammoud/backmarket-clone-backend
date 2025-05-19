package com.backmarket_clone.backmarketClone.repositories.product;

import com.backmarket_clone.backmarketClone.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
