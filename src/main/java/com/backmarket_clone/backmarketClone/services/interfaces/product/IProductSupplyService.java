package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductSupply;

import java.util.List;

public interface IProductSupplyService {
    ProductSupply addProductSupply(ProductSupply productSupply);
    ProductSupply updateProductSupply(ProductSupply productSupply);
    void deleteProductSupply(Long id);
    ProductSupply getProductSupplyById(Long id);
    List<ProductSupply> getAllProductSupplies();
}
