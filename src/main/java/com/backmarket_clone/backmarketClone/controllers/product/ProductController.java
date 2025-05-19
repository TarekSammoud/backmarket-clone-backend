package com.backmarket_clone.backmarketClone.controllers.product;


import com.backmarket_clone.backmarketClone.entities.product.Product;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product Management")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService;

    @PostMapping("/add")
    Product addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @PutMapping("/update")
    Product updateProduct(@RequestBody Product product)
    {
        return productService.updateProduct(product);
    }

    @GetMapping("/all")
    List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    Product getProductById(@PathVariable("id") Long id)
    {
        return productService.getProductById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProduct(@PathVariable("id") Long id)
    {
        productService.deleteProduct(id);
    }
}
