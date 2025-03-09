package org.example._4_Strategy_Pattern.Context;

import org.example._4_Strategy_Pattern.Entity.Item;
import org.example._4_Strategy_Pattern.Interface.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    public ShoppingCart() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    private int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
