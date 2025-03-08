package org.example.Implement;

import org.example.Entity.Order;
import org.example.Interface.OrderState;

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
