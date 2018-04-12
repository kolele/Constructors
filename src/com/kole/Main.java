package com.kole;

public class Main {

    public static void main(String[] args) {
//        BankAccount kole = new BankAccount(123, 20.00, "Kole", "kole@kobas.com", "123321123");
//        kole.depositFunds(200);
//        kole.withdrawFunds(150);
//        kole.withdrawFunds(50);
//        kole.withdrawFunds(10);
//
//        System.out.println(kole.getAccountNumber());
//        System.out.println(kole.getCustomerEmail());
//
//        BankAccount noviAccount = new BankAccount("Time", "kolelel@dsad.com", "2136");
//        System.out.println(noviAccount.getCustomerName());

        VipCustomer kole = new VipCustomer("Kole", "kole@kole.com");
        System.out.println(kole.getCreditLimit());

    }
}
