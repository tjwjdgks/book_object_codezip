package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;

// 세율을 부과해야 하는 변경 사항
public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR  = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;


    // 변경 사항 추가 3
    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(taxRate);
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }


    @Override
    protected Money calculateCallFee(Call call){
        if(call.getFrom().getHour()>=LATE_NIGHT_HOUR){
            return nightlyAmount.times(call.getDuration().getSeconds()/ seconds.getSeconds());
        }
        else
            return regularAmount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
