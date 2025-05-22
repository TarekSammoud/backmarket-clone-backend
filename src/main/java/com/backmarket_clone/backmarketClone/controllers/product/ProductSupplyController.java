package com.backmarket_clone.backmarketClone.controllers.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductSupply;
import com.backmarket_clone.backmarketClone.services.interfaces.product.IProductSupplyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product Supply Management")
@RestController
@RequestMapping("/productSupply")
public class ProductSupplyController {

    @Autowired
    private IProductSupplyService productSupplyService;

    @PostMapping("/add")
    public ProductSupply addProductSupply(@RequestBody ProductSupply productSupply) {
        return productSupplyService.addProductSupply(productSupply);
    }

    @PutMapping("/update")
    public ProductSupply updateProductSupply(@RequestBody ProductSupply productSupply) {
        return productSupplyService.updateProductSupply(productSupply);
    }

    @GetMapping("/all")
    public List<ProductSupply> getAllProductSupplies() {
        return productSupplyService.getAllProductSupplies();
    }

    @GetMapping("/{id}")
    public ProductSupply getProductSupplyById(@PathVariable Long id) {
        return productSupplyService.getProductSupplyById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductSupply(@PathVariable Long id) {
        productSupplyService.deleteProductSupply(id);
    }
}