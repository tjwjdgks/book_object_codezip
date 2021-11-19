package com.company.chapter8;

import com.company.chapter2.DiscountPolicy;
import com.company.chapter2.Money;
import com.company.chapter2.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// DiscounPolicy라는 추상화 의존을 통해 쉽해 컨텍스트를 확장할 수 있다.
public class OverlappendDiscountPolicy implements DiscountPolicy {

    private List<DiscountPolicy> discountPolicies = new ArrayList<>();

    public OverlappendDiscountPolicy(DiscountPolicy... discountPolicies) {
        this.discountPolicies = Arrays.asList(discountPolicies);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        Money result  = Money.ZERO;
        for(DiscountPolicy discountPolicy : discountPolicies)
            result.plus(discountPolicy.calculateDiscountAmount(screening));
        return result;
    }
}
