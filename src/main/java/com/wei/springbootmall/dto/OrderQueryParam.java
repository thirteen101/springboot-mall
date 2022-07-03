package com.wei.springbootmall.dto;

import lombok.Data;

@Data
public class OrderQueryParam {
    Integer userId;
    Integer limit;
    Integer offset;
}
