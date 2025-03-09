package org.example._4_Strategy_Pattern.ConcreteStrategy;

import org.example._4_Strategy_Pattern.Interface.PaymentStrategy;

public class Momo implements PaymentStrategy {
    private String nameAccount;
    private String password;

    public Momo(String nameAccount, String password) {
        this.nameAccount = nameAccount;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Momo");
    }
}
