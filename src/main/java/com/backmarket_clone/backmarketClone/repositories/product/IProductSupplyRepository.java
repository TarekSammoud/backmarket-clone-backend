package com.backmarket_clone.backmarketClone.repositories.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductSupplyRepository extends JpaRepository<ProductSupply,Long> {
}
