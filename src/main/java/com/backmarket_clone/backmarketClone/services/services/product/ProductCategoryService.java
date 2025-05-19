package com.backmarket_clone.backmarketClone.services.services.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backmarket_clone.backmarketClone.repositories.product.IProductCategoryRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductCategoryService;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryService implements IProductCategoryService {
    @Autowired
    IProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory addProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public void deleteProductCategory(Long id) {
        productCategoryRepository.deleteById(id);
    }

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory getProductCategoryById(Long id) {
        return productCategoryRepository.findById(id).orElse(null);
    }
}
