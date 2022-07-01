package com.wei.springbootmall.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Integer orderId;
    private Integer userId;
    private Integer totalAmount;
    private Date createdDate;
    private Date lastModified_date;
    private List<OrderItem> orderItemList;
}
