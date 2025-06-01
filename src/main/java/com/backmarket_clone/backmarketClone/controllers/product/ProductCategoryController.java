package com.backmarket_clone.backmarketClone.controllers.product;

import com.backmarket_clone.backmarketClone.dtos.product.ProductCategoryDTO;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product Category Management")
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    IProductCategoryService productCategoryService;

    @PostMapping("/add")
    ProductCategoryDTO addProductCategory(@RequestBody ProductCategoryDTO productCategory)
    {
       return productCategoryService.addProductCategory(productCategory);
    }

    @PutMapping("/update")
    ProductCategoryDTO updateProductCategory(@RequestBody ProductCategoryDTO productCategory)
    {
        return productCategoryService.updateProductCategory(productCategory);
    }

    @GetMapping("/all")
    List<ProductCategoryDTO> getAllProductCategories()
    {
        return productCategoryService.getAllProductCategories();
    }

    @GetMapping("/{id}")
    ProductCategoryDTO getProductCategoryById(@PathVariable("id") Long id)
    {
        return productCategoryService.getProductCategoryById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProductCategory(@PathVariable("id") Long id)
    {
         productCategoryService.deleteProductCategory(id);
    }

}
