package org.example;

import org.example.Entity.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder(); // Mới tạo -> Đang xử lý -> Đã giao
        System.out.println("----------------");


    }
}