package com.wei.springbootmall.service;

import com.wei.springbootmall.dto.ProductRequest;
import com.wei.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
