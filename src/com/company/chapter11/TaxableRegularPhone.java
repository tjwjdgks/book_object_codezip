package com.company.chapter11;

import com.company.chapter2.Money;

import java.time.Duration;

// 일반 정책 Regular + 세금 정책 추가 클래스
public class TaxableRegularPhone extends  RegularPhone_ch11{

    private double taxRate;
    public TaxableRegularPhone(Money amount, Duration seconds, double taxRate) {
        super(amount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money calculateCallFee(Call_ch11 call){
        Money money = super.calculateCallFee(call);
        return money.plus(money.times(taxRate));
    }
}
