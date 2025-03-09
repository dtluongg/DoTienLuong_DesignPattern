package org.example._3_State_Pattern;

import org.example._3_State_Pattern.Entity.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();

        order.processOrder(); // Mới tạo -> Đang xử lý
        System.out.println("--------------------");

        order.processOrder(); // Đang xử lý -> Đã giao
        System.out.println("--------------------");

        // Mỗi lần chỉ xử lý trạng thái 1 lần.
        // muốn sang trạng thái tiếp theo thì phải gọi thêm 1 lần nữa.
        order.processOrder();
        System.out.println(order.getState().getStateName());
    }
}
