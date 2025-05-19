package com.backmarket_clone.backmarketClone.repositories.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductMediaRepository extends JpaRepository<ProductMedia,Long> {
}
