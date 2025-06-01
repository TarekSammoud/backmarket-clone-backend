package com.backmarket_clone.backmarketClone.services.services.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductCategoryDTO;
import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;
import com.backmarket_clone.backmarketClone.repositories.product.IProductCategoryRepository;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductCategoryService implements IProductCategoryService {

    private final IProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategoryDTO addProductCategory(ProductCategoryDTO dto) {
        ProductCategory category = new ProductCategory();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());

        ProductCategory saved = productCategoryRepository.save(category);
        return toDTO(saved);
    }

    @Override
    public ProductCategoryDTO updateProductCategory(ProductCategoryDTO dto) {
        Optional<ProductCategory> optional = productCategoryRepository.findById(dto.getId());
        if (optional.isPresent()) {
            ProductCategory category = optional.get();
            category.setName(dto.getName());
            category.setDescription(dto.getDescription());

            ProductCategory updated = productCategoryRepository.save(category);
            return toDTO(updated);
        }
        return null;
    }

    @Override
    public void deleteProductCategory(Long id) {
        productCategoryRepository.deleteById(id);
    }

    @Override
    public List<ProductCategoryDTO> getAllProductCategories() {
        return productCategoryRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductCategoryDTO getProductCategoryById(Long id) {
        return productCategoryRepository.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    // DTO Mapper method
    private ProductCategoryDTO toDTO(ProductCategory category) {
        ProductCategoryDTO dto = new ProductCategoryDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        return dto;
    }
}
