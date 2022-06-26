package com.wei.springbootmall.dto;

import com.wei.springbootmall.constant.ProductCategory;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductRequest {
    @NotNull
    String productName;
    @NotNull
    ProductCategory category;
    @NotNull
    String imageUrl;
    @NotNull
    Integer price;
    @NotNull
    Integer stock;
    String description;
}
