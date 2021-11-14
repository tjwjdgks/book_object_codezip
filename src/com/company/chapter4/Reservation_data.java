package com.company.chapter4;

public class Reservation_data {
    private Customer_data customer;
    private Screening_data screening;
    private Money_data money;
    private int auidenceCount;

    public Reservation_data(Customer_data customer, Screening_data screening, Money_data money, int auidenceCount) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
        this.auidenceCount = auidenceCount;
    }

    public Customer_data getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_data customer) {
        this.customer = customer;
    }

    public Screening_data getScreening() {
        return screening;
    }

    public void setScreening(Screening_data screening) {
        this.screening = screening;
    }

    public Money_data getMoney() {
        return money;
    }

    public void setMoney(Money_data money) {
        this.money = money;
    }

    public int getAuidenceCount() {
        return auidenceCount;
    }

    public void setAuidenceCount(int auidenceCount) {
        this.auidenceCount = auidenceCount;
    }
}
