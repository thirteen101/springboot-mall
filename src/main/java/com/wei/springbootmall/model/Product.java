package com.wei.springbootmall.model;

import com.wei.springbootmall.constant.ProductCategory;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    Integer productId;
    String productName;
    ProductCategory category;
    String imageUrl;
    Integer price;
    Integer stock;
    String description;
    Date createdDate;
    Date lastModifiedDate;
}
