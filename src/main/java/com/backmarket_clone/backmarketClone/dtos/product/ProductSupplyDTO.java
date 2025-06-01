package com.backmarket_clone.backmarketClone.dtos.product;

import com.backmarket_clone.backmarketClone.entities.product.ProductConditionRating;
import lombok.Data;

import java.util.Date;

@Data
public class ProductSupplyDTO {
    private Long id;

    private Long productId;
    private Long supplierId;

    private int batteryPercentage;
    private ProductConditionRating conditionRating;
    private double price;
    private String color;
    private Integer storageCapacity;
    private boolean isAvailable;

    private Date createdAt;
    private Date updatedAt;
}
