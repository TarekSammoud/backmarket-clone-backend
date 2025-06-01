package com.backmarket_clone.backmarketClone.dtos.product;

import lombok.Data;

import java.util.Date;

@Data
public class ProductMediaDTO {
    private Long id;
    private String mediaUrl;
    private String fileType;
    private Long fileSize;

    private Long productId;

    private Date createdAt;
    private Date updatedAt;
}
