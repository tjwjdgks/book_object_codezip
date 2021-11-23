package com.company.chapter11;

import com.company.chapter2.Money;

public abstract class AdditionalRatePolicy_ch11 implements RatePolicy_ch11 {
    private RatePolicy_ch11 next;

    public AdditionalRatePolicy_ch11(RatePolicy_ch11 next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone_ch11 phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }
    protected abstract Money afterCalculated(Money fee);
}
