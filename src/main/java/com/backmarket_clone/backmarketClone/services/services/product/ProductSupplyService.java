package com.backmarket_clone.backmarketClone.services.services.product;


import com.backmarket_clone.backmarketClone.entities.product.ProductSupply;
import com.backmarket_clone.backmarketClone.repositories.product.IProductSupplyRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSupplyService implements IProductSupplyService {

    @Autowired
    private IProductSupplyRepository productSupplyRepository;

    @Override
    public ProductSupply addProductSupply(ProductSupply productSupply) {
        return productSupplyRepository.save(productSupply);
    }

    @Override
    public ProductSupply updateProductSupply(ProductSupply productSupply) {
        return productSupplyRepository.save(productSupply);
    }

    @Override
    public void deleteProductSupply(Long id) {
        productSupplyRepository.deleteById(id);
    }

    @Override
    public ProductSupply getProductSupplyById(Long id) {
        return productSupplyRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProductSupply> getAllProductSupplies() {
        return productSupplyRepository.findAll();
    }
}
