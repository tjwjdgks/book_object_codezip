package com.company.chapter5;

import java.time.Duration;
import java.util.List;

// ...생성자 생략
public abstract class Movie {

    private String title;
    private Duration duration;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public Movie(String title, Duration duration, Money fee, List<DiscountCondition> discountConditions) {
        this.title = title;
        this.duration = duration;
        this.fee = fee;
        this.discountConditions = discountConditions;
    }

    public Money calculateFee(Screening screening){
        if(isDiscountable(screening)){
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    protected Money getFee() {
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

}
