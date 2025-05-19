package com.backmarket_clone.backmarketClone.repositories.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
