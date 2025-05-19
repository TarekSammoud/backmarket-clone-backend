package com.backmarket_clone.backmarketClone.controllers.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductCategory;
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
    ProductCategory addProductCategory(@RequestBody ProductCategory productCategory)
    {
       return productCategoryService.addProductCategory(productCategory);
    }

    @PutMapping("/update")
    ProductCategory updateProductCategory(@RequestBody ProductCategory productCategory)
    {
        return productCategoryService.updateProductCategory(productCategory);
    }

    @GetMapping("/all")
    List<ProductCategory> getAllProductCategories()
    {
        return productCategoryService.getAllProductCategories();
    }

    @GetMapping("/{id}")
    ProductCategory getProductCategoryById(@PathVariable("id") Long id)
    {
        return productCategoryService.getProductCategoryById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProductCategory(@PathVariable("id") Long id)
    {
         productCategoryService.deleteProductCategory(id);
    }

}
