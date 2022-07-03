package com.wei.springbootmall.service;

import com.wei.springbootmall.dto.CreateOrderRequest;
import com.wei.springbootmall.dto.OrderQueryParam;
import com.wei.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParam orderQueryParam);

    List<Order> getOrders(OrderQueryParam orderQueryParam);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
