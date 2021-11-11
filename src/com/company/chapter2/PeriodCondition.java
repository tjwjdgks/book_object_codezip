package com.company.chapter2;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition{
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartime().toLocalTime()) <=0 &&
                endTime.compareTo(screening.getStartime().toLocalTime()) >=0;
    }
}
