package com.wei.springbootmall.dao;

import com.wei.springbootmall.dto.OrderQueryParam;
import com.wei.springbootmall.model.Order;
import com.wei.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParam orderQueryParam);

    List<Order> getOrders(OrderQueryParam orderQueryParam);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
