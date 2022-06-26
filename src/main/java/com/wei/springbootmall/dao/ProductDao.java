package com.wei.springbootmall.dao;

import com.wei.springbootmall.constant.ProductCategory;
import com.wei.springbootmall.dto.ProductQueryParams;
import com.wei.springbootmall.dto.ProductRequest;
import com.wei.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
