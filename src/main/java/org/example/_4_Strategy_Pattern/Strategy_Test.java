package org.example._4_Strategy_Pattern;

import org.example._4_Strategy_Pattern.ConcreteStrategy.CreditCard;
import org.example._4_Strategy_Pattern.ConcreteStrategy.Momo;
import org.example._4_Strategy_Pattern.Context.ShoppingCart;
import org.example._4_Strategy_Pattern.Entity.Item;
import org.example._4_Strategy_Pattern.Interface.PaymentStrategy;

public class Strategy_Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1423", 99);
        Item item2 = new Item("1111", 100);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new Momo("Do Tien Luong", "140303"));
        cart.pay(new CreditCard("Do Tien Luong", "6721116908", "255", "12/25"));
    }
    // Tại sao kq lại là 199 paid with Momo 199 paid with credit/debit
}
