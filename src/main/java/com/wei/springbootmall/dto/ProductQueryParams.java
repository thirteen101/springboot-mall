package com.wei.springbootmall.dto;

import com.wei.springbootmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {
    private ProductCategory category;
    private String search;
}
