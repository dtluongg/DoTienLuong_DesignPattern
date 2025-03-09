package org.example._3_State_Pattern.Entity;

import org.example._3_State_Pattern.Implement.CancelledOrderState;
import org.example._3_State_Pattern.Implement.NewOrderState;
import org.example._3_State_Pattern.Interface.OrderState;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState(); // Đặt trạng thái ban đầu là "Mới Tạo"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void processOrder() {
        System.out.println("Trạng thái hiện tại: " + state.getStateName());
        state.handleOrder(this); // Gọi phương thức xử lý của state hiện tại
    }

    public void cancelOrder() {
        System.out.println("Hủy đơn hàng...");
        System.out.println("Trạng thái trước khi hủy: " + state.getStateName()); // In trạng thái TRƯỚC KHI HỦY
        this.state = new CancelledOrderState();
        state.handleOrder(this);
    }

}
