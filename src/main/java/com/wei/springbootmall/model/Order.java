package com.wei.springbootmall.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer orderId;
    private Integer userId;
    private Integer totalAmount;
    private Date createdDate;
    private Date lastModified_date;
}
