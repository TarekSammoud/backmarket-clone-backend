package com.backmarket_clone.backmarketClone.services.services.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backmarket_clone.backmarketClone.repositories.product.IProductMediaRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductMediaService;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductMediaService implements IProductMediaService {
    @Autowired
    IProductMediaRepository productMediaRepository;

    @Override
    public ProductMedia addProductMedia(ProductMedia productMedia) {
        return productMediaRepository.save(productMedia);
    }

    @Override
    public ProductMedia updateProductMedia(ProductMedia productMedia) {
        return productMediaRepository.save(productMedia);
    }

    @Override
    public void deleteProductMedia(Long id) {
        productMediaRepository.deleteById(id);
    }

    @Override
    public List<ProductMedia> getAllProductMedias() {
        return productMediaRepository.findAll();
    }


    @Override
    public ProductMedia getProductMediaById(Long id) {
        return productMediaRepository.findById(id).orElse(null);
    }
}
