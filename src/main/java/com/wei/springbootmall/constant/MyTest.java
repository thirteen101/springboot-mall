package com.wei.springbootmall.constant;

public class MyTest {

    public static void main(String[] args) {
        ProductCategory productCategory = ProductCategory.CAR;
        String s = productCategory.name();

        ProductCategory productCategory1 = ProductCategory.valueOf("Car");
        String s1 = productCategory1.name();
    }
}
