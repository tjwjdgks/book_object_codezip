package com.company.chapter4;

import com.company.chapter2.DiscountCondition;
import com.company.chapter2.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Movie_data {
    private String title;
    private Duration runningTime;
    private Money_data fee;
    private List<DiscountCondition_data> discountConditions;

    private MovieType_data movieType;
    private Money_data discountAmount;
    private double discountPercent;

    public MovieType_data getMovieType() {
        return movieType;
    }

    // 개선된 코드
    public Money_data calculateAmountDiscountedFee(){
        if(movieType != MovieType_data.AMOUNT_DISCOUNT)
            throw new IllegalArgumentException();
        return fee.minus(discountAmount);
    }

    // 개선된 코드
    public Money_data calculatePecentDiscountedFee(){
        if(movieType != MovieType_data.PERCENT_DISCOUNT)
            throw new IllegalArgumentException();

        return fee.minus(fee.times(discountPercent));
    }
    // 개선된 코드
    public Money_data calculateNoneDiscountedFee(){
        if(movieType != MovieType_data.PERCENT_DISCOUNT)
            throw new IllegalArgumentException();

        return fee;
    }
    // 개선된 코드
    public boolean isDiscountable(LocalDateTime whenScreened, int sequence){
        for(DiscountCondition_data condition : discountConditions){
            if(condition.getType() == DiscountConditionType_data.PERIOD){
                if(condition.isDiscountable(whenScreened.getDayOfWeek(),whenScreened.toLocalTime())) return true;
            }
            else{
                if(condition.isDiscountable(sequence)) return true;
            }
        }
        return false;
    }

}
