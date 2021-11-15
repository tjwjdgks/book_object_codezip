package com.company.chapter5;

import java.time.Duration;
import java.util.List;

public class PercentMovie extends Movie{
    private double discountPercent;
    public PercentMovie(String title, Duration duration, Money fee,double discountPercent, List<DiscountCondition> discountConditions) {
        super(title, duration, fee, discountConditions);
        this.discountPercent = discountPercent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(discountPercent);
    }
}
