package com.backmarket_clone.backmarketClone.services.interfaces.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;

import java.util.List;

public interface IProductMediaService {
    ProductMedia addProductMedia(ProductMedia productMedia);
    ProductMedia updateProductMedia(ProductMedia productMedia);
    void deleteProductMedia(Long id);
    List<ProductMedia> getAllProductMedias();
    ProductMedia getProductMediaById(Long id);

}
