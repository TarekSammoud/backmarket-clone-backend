package com.backmarket_clone.backmarketClone.services.services.product;

import com.backmarket_clone.backmarketClone.entities.product.Product;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backmarket_clone.backmarketClone.repositories.product.IProductRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductService;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
