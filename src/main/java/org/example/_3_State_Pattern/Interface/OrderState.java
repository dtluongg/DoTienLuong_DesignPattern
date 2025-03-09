package org.example._3_State_Pattern.Interface;

import org.example._3_State_Pattern.Entity.Order;

public interface OrderState {
    void handleOrder(Order order); // phương thức xử lý logic đơn hàng
    String getStateName(); // Phương thức trả về tên trạng thái;
}
