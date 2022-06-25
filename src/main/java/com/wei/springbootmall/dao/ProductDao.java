package com.wei.springbootmall.dao;

import com.wei.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer id);
}
