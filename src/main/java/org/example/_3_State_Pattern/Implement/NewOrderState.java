package org.example._3_State_Pattern.Implement;

import org.example._3_State_Pattern.Entity.Order;
import org.example._3_State_Pattern.Interface.OrderState;

public class NewOrderState  implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đơn hàng mới tạo, kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingOrderState()); // chuyển sang trạng thái đang xử lý;
        System.out.println("Chuyển đơn hàng sang trạng thái đang xử lý.");
        System.out.println("Trạng thái hiện tại: " + order.getState().getStateName()); // In trạng thái sau khi chuyển
    }
    @Override
    public String getStateName(){
        return "Mới tạo";
    }
}
