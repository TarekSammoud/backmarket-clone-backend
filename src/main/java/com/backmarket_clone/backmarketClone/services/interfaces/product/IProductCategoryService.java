package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;

import java.util.List;

public interface IProductCategoryService {
    ProductCategory addProductCategory(ProductCategory productCategory);
    ProductCategory updateProductCategory(ProductCategory productCategory);
    void deleteProductCategory(Long id);
    List<ProductCategory> getAllProductCategories();
    ProductCategory getProductCategoryById(Long id);


}
