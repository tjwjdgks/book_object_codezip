package com.company.chapter4;

// 영화 예매 절차 구현 클래스
public class ReservationAgency_data {
    public Reservation_data reservation(Screening_data screening, Customer_data customer, int audienceCount){
        Money_data totalFee = screening.calculateFee(audienceCount);
        return new Reservation_data(customer,screening,totalFee,audienceCount);
    }
}
