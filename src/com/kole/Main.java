package com.kole;

public class Main {

    public static void main(String[] args) {
        BankAccount kole = new BankAccount(123, 20.00, "Kole", "kole@kobas.com", "123321123");
        kole.depositFunds(200);
        kole.withdrawFunds(150);
        kole.withdrawFunds(50);
        kole.withdrawFunds(10);

        System.out.println(kole.getAccountNumber());
        System.out.println(kole.getCustomerEmail());

    }
}
