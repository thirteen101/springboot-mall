package com.wei.springbootmall.service.impl;

import com.wei.springbootmall.dao.ProductDao;
import com.wei.springbootmall.model.Product;
import com.wei.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
