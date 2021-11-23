package com.company.chapter11;

import com.company.chapter2.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone_ch11 extends NightlyDiscountPhone_ch11 {

    private double taxRate;

    public TaxableNightlyDiscountPhone_ch11(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(nightlyAmount, regularAmount, seconds);
        this.taxRate = taxRate;
    }
    @Override
    protected Money calculateCallFee(Call_ch11 call){
        Money money = super.calculateCallFee(call);
        return money.plus(money.times(taxRate));
    }
}
