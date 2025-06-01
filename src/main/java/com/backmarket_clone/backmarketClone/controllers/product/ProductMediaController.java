package com.backmarket_clone.backmarketClone.controllers.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductMediaDTO;
import com.backmarket_clone.backmarketClone.entities.product.ProductMedia;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductMediaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product Media Management")
@RestController
@RequestMapping("/productMedia")
public class ProductMediaController {
    
    @Autowired
    IProductMediaService productMediaService;


    @PostMapping("/add")
    ProductMediaDTO addProductMedia(@RequestBody ProductMediaDTO product)
    {
        return productMediaService.addProductMedia(product);
    }

    @PutMapping("/update")
    ProductMediaDTO updateProductMedia(@RequestBody ProductMediaDTO product)
    {
        return productMediaService.updateProductMedia(product);
    }

    @GetMapping("/all")
    List<ProductMediaDTO> getAllProductMedias()
    {
        return productMediaService.getAllProductMedias();
    }

    @GetMapping("/{id}")
    ProductMediaDTO getProductMediaById(@PathVariable("id") Long id)
    {
        return productMediaService.getProductMediaById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProductMedia(@PathVariable("id") Long id)
    {
        productMediaService.deleteProductMedia(id);
    }
    
}
