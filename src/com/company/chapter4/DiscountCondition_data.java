package com.company.chapter4;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition_data {
    private DiscountConditionType_data type;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountCondition_data(DiscountConditionType_data type, int sequence, DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.type = type;
        this.sequence = sequence;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public DiscountConditionType_data getType() {
        return type;
    }

    // 개선된 코드
    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time){
        if(type != DiscountConditionType_data.PERIOD)
            throw  new IllegalArgumentException();
        return this.dayOfWeek.equals(dayOfWeek)
                && this.startTime.compareTo(time) <= 0
                && this.endTime.compareTo(time) >= 0;
    }
    // 개선된 코드
    public boolean isDiscountable(int sequence){
        if(type!=DiscountConditionType_data.SEQUENCE)
            throw  new IllegalArgumentException();

        return this.sequence == sequence;
    }
}
