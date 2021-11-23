package com.company.chapter11;

import com.company.chapter2.Money;

import java.time.Duration;

public class RegularPolicy_ch11 extends BasicRatePolicy_ch11 {
    private Money amount;
    private Duration seconds;

    public RegularPolicy_ch11(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call_ch11 call) {
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
