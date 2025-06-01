package com.backmarket_clone.backmarketClone.dtos.product;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double price;

    private Long categoryId;

    private List<ProductMediaDTO> mediaList;

    private Date createdAt;
    private Date updatedAt;

    private List<ProductSupplyDTO> supplies;
}
