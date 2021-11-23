package com.company.chapter11;

import com.company.chapter2.Money;

// 부가 정책 : 세금 정책
public class TaxablePolicy_ch11 extends AdditionalRatePolicy_ch11{
    private double taxRatio;
    public TaxablePolicy_ch11(RatePolicy_ch11 next, double taxRatio) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
