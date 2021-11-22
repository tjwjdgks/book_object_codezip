package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 세율을 부과해야 하는 변경 사항
public class NightlyDiscountPhone {
    private static final int LATE_NIGHT_HOUR  = 22;
    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    // 세율 추가 중복작업 2
    private double taxRate;
    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public Money calculateFee(){

        Money result = Money.ZERO;
        for(Call call : calls){
            if(call.getFrom().getHour()>= LATE_NIGHT_HOUR){
                result = result.plus(nightlyAmount.times(call.getDuration().getSeconds()/seconds.getSeconds()));
            }
            else{
                result = result.plus(regularAmount.times(call.getDuration().getSeconds()/seconds.getSeconds()));
            }
            return result;
        }
        // 세율 계산 중복작업 2
        return result.plus(result.times(taxRate));
    }
}
