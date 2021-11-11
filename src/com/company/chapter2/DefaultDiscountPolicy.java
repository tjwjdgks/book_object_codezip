package com.company.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions =  new ArrayList<>();

    // ... 0개 또는 1개 이상
    public DefaultDiscountPolicy(DiscountCondition ... discountConditions) {
        this.conditions = Arrays.asList(discountConditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening){
        for(DiscountCondition  each : conditions){
            if(each.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract  protected Money getDiscountAmount(Screening screening);
}
