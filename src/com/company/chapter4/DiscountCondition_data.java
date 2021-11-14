package com.company.chapter4;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition_data {
    private DiscountConditionType_data type;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalTime statTime;
    private LocalTime endTime;

    public DiscountConditionType_data getType() {
        return type;
    }

    public void setType(DiscountConditionType_data type) {
        this.type = type;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStatTime() {
        return statTime;
    }

    public void setStatTime(LocalTime statTime) {
        this.statTime = statTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
