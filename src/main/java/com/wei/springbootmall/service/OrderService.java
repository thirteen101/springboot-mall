package com.wei.springbootmall.service;

import com.wei.springbootmall.dto.CreateOrderRequest;
import com.wei.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
