package com.company.chapter5;

import java.time.Duration;
import java.util.List;

public class NoneMovie extends Movie{
    public NoneMovie(String title, Duration duration, Money fee, List<DiscountCondition> discountConditions) {
        super(title, duration, fee, discountConditions);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
