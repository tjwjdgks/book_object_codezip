package com.company.chapter5;

public class SequnceCondition {

    private int sequnce;

    public boolean isSatisfiedBy(Screening screening) {
        return sequnce == screening.getSequence();
    }
}
