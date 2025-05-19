package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.entities.product.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    Product getProductById(Long id);

}
