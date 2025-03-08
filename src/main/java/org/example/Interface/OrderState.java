package org.example.Interface;

import org.example.Entity.Order;

public interface OrderState {
    void handleOrder(Order order); // phương thức xử lý logic đơn hàng
    String getStateName(); // Phương thức trả về tên trạng thái;
}
