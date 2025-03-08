package org.example.Entity;

import org.example.Implement.CancelledOrderState;
import org.example.Implement.NewOrderState;
import org.example.Implement.ProcessingOrderState;
import org.example.Implement.ShippedOrderState;
import org.example.Interface.OrderState;

public class Order {
    private OrderState state;
    public Order(){
        this.state = new NewOrderState();
    }

    public void setState(OrderState state){
        this.state = state;
    }
    public OrderState getState(){
        return this.state;
    }
    public void processOrder(){
        System.out.println("Trạng thái hiện tại: " + state.getStateName());
        state.handleOrder(this); // Gọi phương thức xử lý của state hiện tại
    }
    public void cancelOrder(){
        System.out.println("Huỷ đơn hàng...");
        this.state = new CancelledOrderState();
        state.handleOrder(this);
    }

}
