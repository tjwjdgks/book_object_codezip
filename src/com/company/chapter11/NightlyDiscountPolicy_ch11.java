package com.company.chapter11;

import com.company.chapter2.Money;

import java.time.Duration;

public class NightlyDiscountPolicy_ch11 extends BasicRatePolicy_ch11 {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPolicy_ch11(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call_ch11 call) {
        if(call.getFrom().getHour()>=LATE_NIGHT_HOUR){
            return nightlyAmount.times(call.getDuration().getSeconds()/ seconds.getSeconds());
        }

        return regularAmount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
