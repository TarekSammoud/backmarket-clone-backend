package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductMediaDTO;
import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;

import java.util.List;

public interface IProductMediaService {
    public ProductMediaDTO addProductMedia(ProductMediaDTO dto);
    ProductMediaDTO updateProductMedia(ProductMediaDTO productMedia);
    void deleteProductMedia(Long id);
    List<ProductMediaDTO> getAllProductMedias();
    ProductMediaDTO getProductMediaById(Long id);

}
