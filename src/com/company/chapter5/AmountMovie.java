package com.company.chapter5;

import java.time.Duration;
import java.util.List;

public class AmountMovie extends Movie {

    private Money discountAmount;

    public AmountMovie(String title, Duration duration, Money fee, Money discountAmount, List<DiscountCondition> discountConditions) {
        super(title, duration, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountAmount;
    }
}
