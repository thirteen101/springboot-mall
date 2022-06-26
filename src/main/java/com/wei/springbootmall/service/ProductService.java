package com.wei.springbootmall.service;

import com.wei.springbootmall.constant.ProductCategory;
import com.wei.springbootmall.dto.ProductRequest;
import com.wei.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
