package org.example._3_State_Pattern.Implement;

import org.example._3_State_Pattern.Entity.Order;
import org.example._3_State_Pattern.Interface.OrderState;

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
