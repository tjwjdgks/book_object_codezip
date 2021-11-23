package com.company.chapter11;

import com.company.chapter10.Call;
import com.company.chapter10.Phone;
import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 기본 정책 - 일반 요금제
public class RegularPhone_ch11 extends Phone_ch11 {
    protected Money amount;
    protected Duration seconds;

    public RegularPhone_ch11(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    @Override
    protected Money calculateCallFee(Call_ch11 call){
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
