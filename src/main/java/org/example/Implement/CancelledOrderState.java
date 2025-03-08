package org.example.Implement;

import org.example.Entity.Order;
import org.example.Interface.OrderState;

public class CancelledOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đơn hàng đã bị hủy. Tiến hành hoàn tiền...");
    }

    @Override
    public String getStateName() {
        return "Đã Hủy";
    }
}
