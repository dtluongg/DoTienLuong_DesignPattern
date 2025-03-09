package org.example._4_Strategy_Pattern.ConcreteStrategy;

import org.example._4_Strategy_Pattern.Interface.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
