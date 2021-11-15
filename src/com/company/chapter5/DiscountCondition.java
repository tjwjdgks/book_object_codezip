package com.company.chapter5;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {

    private DiscountConditionType type;
    private int sequnce;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isSatisfiedBy(Screening screening) {
        if(type == DiscountConditionType.PERIOD)
            return isSatisfiedByPeriod(screening);
        return isSatisfiedBySequnce(screening);
    }

    private boolean isSatisfiedBySequnce(Screening screening) {
        return sequnce == screening.getSequence();
    }

    private boolean isSatisfiedByPeriod(Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <=0 &&
                endTime.compareTo(screening.getWhenScreened().toLocalTime()) >=0;
    }


}
