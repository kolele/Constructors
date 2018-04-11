package com.kole;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(){
        this(6576, 30,"Leko", "LEKOKO@LAOK.com", "8498468894984");
        System.out.println("Empty construtor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void withdrawFunds (double amount){
        if (this.balance <0 ){
            System.out.println("Cannot withdraw funds - not enough funds. Current balance is " + this.balance);
        } else if (this.balance - amount <0){
            System.out.println("Cannot withdraw funds - not enough funds. Current balance is " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println(amount + " deducted from account. Remaining funds are " + this.balance);
        }

    }

    public void depositFunds (double amount){
        this.balance += amount;
        System.out.println("Deposited! Current balance is " + this.balance);
    }
}
