package org.example._3_State_Pattern.Implement;

import org.example._3_State_Pattern.Entity.Order;
import org.example._3_State_Pattern.Interface.OrderState;

public class ShippedOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đơn hàng đã được giao thành công.");
    }

    @Override
    public String getStateName() {
        return "Đã Giao";
    }
}
