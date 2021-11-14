package com.company.chapter4;

import com.company.chapter2.DiscountCondition;
import com.company.chapter2.Money;

import java.time.Duration;
import java.util.List;

public class Movie_data {
    private String title;
    private Duration runningTime;
    private Money_data fee;
    private List<DiscountCondition_data> discountConditions;

    private MovieType_data movieType;
    private Money_data discountAmount;
    private double discountPercent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money_data getFee() { // ex) (1) 캡슐화 위반
        return fee;
    }

    public void setFee(Money_data fee) {  // ex) (1) 캡슐화 위반
        this.fee = fee;
    }

    public List<DiscountCondition_data> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(List<DiscountCondition_data> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MovieType_data getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType_data movieType) {
        this.movieType = movieType;
    }

    public Money_data getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money_data discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
