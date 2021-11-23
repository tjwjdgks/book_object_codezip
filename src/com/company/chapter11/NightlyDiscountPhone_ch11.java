package com.company.chapter11;

import com.company.chapter10.Call;
import com.company.chapter10.Phone;
import com.company.chapter2.Money;

import java.time.Duration;

// 기본 정책 심야 할인 요금제
public class NightlyDiscountPhone_ch11 extends Phone_ch11 {
    private static final int LATE_NIGHT_HOUR  = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;


    public NightlyDiscountPhone_ch11(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }


    @Override
    protected Money calculateCallFee(Call_ch11 call){
        if(call.getFrom().getHour()>=LATE_NIGHT_HOUR){
            return nightlyAmount.times(call.getDuration().getSeconds()/ seconds.getSeconds());
        }
        else
            return regularAmount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
