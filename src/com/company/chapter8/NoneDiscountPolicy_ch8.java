package com.company.chapter8;

import com.company.chapter2.DiscountPolicy;
import com.company.chapter2.Money;
import com.company.chapter2.Screening;

public class NoneDiscountPolicy_ch8 implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
