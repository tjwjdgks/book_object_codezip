package com.company.chapter5;


public class SequnceCondition implements DiscountCondition {

    private int sequnce;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return sequnce == screening.getSequence();
    }
}
