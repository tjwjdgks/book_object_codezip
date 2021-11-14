package com.company.chapter4;

import com.company.chapter2.Customer;

// 영화 예매 절차 구현 클래스
public class ReservationAgency_data {
    public Reservation_data reservation(Screening_data screening, Customer_data customer, int audienceCount){
        Movie_data movie = screening.getMovie();

        boolean discountable = false;
        for(DiscountCondition_data condition : movie.getDiscountConditions()){
            if(condition.getType() == DiscountConditionType_data.PERIOD){
                discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek())
                        && condition.getStatTime().compareTo(screening.getWhenScreened().toLocalTime()) <=0
                        && condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >=0;
            }
            else{
                discountable = condition.getSequence() == screening.getSequence();
            }

            if(discountable) break;
        }

        Money_data fee;
        Money_data totalFee;
        if(discountable){
            Money_data discountAmount = Money_data.ZERO;
            switch(movie.getMovieType()){
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    discountAmount = Money_data.ZERO;
                    break;
            }
            fee = movie.getFee().minus(discountAmount);
        }
        else{
            fee= movie.getFee();
        }
        totalFee  = fee.times(audienceCount);

        return new Reservation_data(customer,screening,totalFee,audienceCount);
    }
}
