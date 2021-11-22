package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 상속을 통해 중복된 코드는 줄일 수 있었지만 부모 클래스와 강하게 결합됨
// 세율을 부과해야 하는 변경 사항
public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR  = 22;

    private Money nightlyAmount;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(regularAmount,seconds,taxRate);
        this.nightlyAmount = nightlyAmount;
        this.seconds = seconds;
    }

    @Override
    public Money calculateFee(){

        Money result = super.calculateFee();
        Money nightlyFee = Money.ZERO;
        for(Call call : calls){
            if(call.getFrom().getHour()>= LATE_NIGHT_HOUR){
                nightlyFee = nightlyFee.plus(getAmount().minus(nightlyAmount)
                        .times(call.getDuration().getSeconds()/ getSeconds().getSeconds()));
            }
        }
        // 세율 계산 중복작업 2
        return result.minus(nightlyFee.plus(nightlyFee.times(taxRate)));
    }
}
