package com.backmarket_clone.backmarketClone.services.services.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductCategoryDTO;
import com.backmarket_clone.backmarketClone.dtos.product.ProductMediaDTO;
import com.backmarket_clone.backmarketClone.entities.product.Product;
import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;
import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;
import com.backmarket_clone.backmarketClone.repositories.product.IProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backmarket_clone.backmarketClone.repositories.product.IProductMediaRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductMediaService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductMediaService implements IProductMediaService {
    @Autowired
    IProductMediaRepository productMediaRepository;

    @Autowired
    IProductRepository productRepository;

    public ProductMediaDTO addProductMedia(ProductMediaDTO dto) {
        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + dto.getProductId()));

        ProductMedia media = new ProductMedia();
        media.setMediaUrl(dto.getMediaUrl());
        media.setFileType(dto.getFileType());
        media.setFileSize(dto.getFileSize());
        media.setProduct(product);

        ProductMedia saved = productMediaRepository.save(media);
        return toDTO(saved);
    }

    @Override
    public ProductMediaDTO updateProductMedia(ProductMediaDTO dto) {
        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + dto.getProductId()));

        ProductMedia media = new ProductMedia();
        media.setMediaUrl(dto.getMediaUrl());
        media.setFileType(dto.getFileType());
        media.setFileSize(dto.getFileSize());
        media.setProduct(product);
        ProductMedia saved = productMediaRepository.save(media);
        return toDTO(saved);

    }

    @Override
    public void deleteProductMedia(Long id) {
        productMediaRepository.deleteById(id);
    }

    @Override
    public List<ProductMediaDTO> getAllProductMedias() {
        return productMediaRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }


    @Override
    public ProductMediaDTO getProductMediaById(Long id) {
        return productMediaRepository.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    private ProductMediaDTO toDTO(ProductMedia media) {
        Product product = productRepository.findById(media.getProduct().getId())
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + media.getProduct().getId()));

        ProductMediaDTO dto = new ProductMediaDTO();
        dto.setId(media.getId());
        dto.setMediaUrl(media.getMediaUrl());
        dto.setFileType(media.getFileType());
        dto.setFileSize(media.getFileSize());
        dto.setProductId(product.getId());
        return dto;
    }
}
