package com.company.chapter5;

import java.time.Duration;
import java.util.List;

// ...생성자 생략
public class Movie {

    private String title;
    private Duration duration;
    private Money fee;
    private List<PeriodCondition> discountPeriodConditions;
    private List<SequnceCondition> discountSequnceConditions;
    private MovieDiscountType movieDiscountType;
    private Money discountAmount;
    private double discountPercent;

    public Money calculateFee(Screening screening){
        if(isDiscountable(screening)){
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private Money calculateDiscountAmount() {
        switch (movieDiscountType){
            case AMOUNT_DISCOUNT:
                return discountAmount;
            case PERCENT_DISCOUNT:
                return fee.times(discountPercent);
            case NONE:
                return Money.ZERO;
        }
        throw new IllegalStateException();
    }

    private boolean isDiscountable(Screening screening) {
        return checkPeriodConditions(screening) || checkSequenceConditions(screening);
    }

    private boolean checkSequenceConditions(Screening screening) {
        return discountSequnceConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private boolean checkPeriodConditions(Screening screening) {
        return discountSequnceConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }
}
