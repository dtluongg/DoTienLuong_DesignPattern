package org.example._3_State_Pattern.Implement;

import org.example._3_State_Pattern.Entity.Order;
import org.example._3_State_Pattern.Interface.OrderState;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đơn hàng đang được xử lý. Đóng gói và vận chuyển...");
        order.setState(new ShippedOrderState()); // Chuyển sang trạng thái "Đã giao"
        System.out.println("Đơn hàng đã được giao cho đơn vị vận chuyển. Chuyển sang trạng thái Đã giao.");
    }

    @Override
    public String getStateName() {
        return "Đang Xử Lý";
    }
}
