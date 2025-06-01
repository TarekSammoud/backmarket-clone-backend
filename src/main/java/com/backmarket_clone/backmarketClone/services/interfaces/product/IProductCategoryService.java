package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductCategoryDTO;

import java.util.List;

public interface IProductCategoryService {
    public ProductCategoryDTO addProductCategory(ProductCategoryDTO dto) ;
    ProductCategoryDTO updateProductCategory(ProductCategoryDTO dto);
    void deleteProductCategory(Long id);
    List<ProductCategoryDTO> getAllProductCategories();
    ProductCategoryDTO getProductCategoryById(Long id);


}
