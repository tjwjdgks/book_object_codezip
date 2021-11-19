package com.company.chapter8;

import com.company.chapter2.*;

import java.time.Duration;

public class movie_ch8 {
    private DiscountPolicy discountPolicy; // 할인정책으로 AmountPolicy 와 PercentPolicy 가 있음
    private String title;
    private Duration runningtime;
    private Money fee;
    /*
    setter로 discountpolicy 설정하는 방법은 의존 대상을 설정하기 전까지 불안전해질 수 있음
    따라서 생성자와 setter를 혼합하는 방식으로 사용하는 것이 좋다

     */
    // 좋은 방법
    public movie_ch8(DiscountPolicy discountPolicy, String title, Duration runningtime, Money fee) {
        this.discountPolicy = discountPolicy;
        this.title = title;
        this.runningtime = runningtime;
        this.fee = fee;
    }
    // 안좋은 방법 : 구체적인 클래스를 의존시켰기 때문에 다른 종류의 할인 정책을 사용할 수 없다
    /*
    public movie_ch8(PercentDiscountPolicy percentDiscountPolicy, String title, Duration runningtime, Money fee) {
        this.discountPolicy = percentDiscountPolicy;
        this.title = title;
        this.runningtime = runningtime;
        this.fee = fee;
    }
     */

    // 안좋은 방법 : 의존성이 명시적이지 않다. 이는 의존성을 파악하기 위해 내부 구현을 살펴봐야 한다.
    // 또한 DiscountPolicy를 다른 클래스에서 재사용하기 위해서는 내부 구현을 직접 변경해야한다
    /*
    public movie_ch8(String title, Duration runningtime, Money fee) {
        this.title = title;
        this.runningtime = runningtime;
        this.fee = fee;
        DiscountPolicy discountPolicy = new AmountDiscountPolicy(...);
    }

     */

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    // 예외케이스 보다 해당 조건에 맞는 DiscountPolicy를 만들것 -> NoneDiscountPolicy_ch8
    /*
    public  Money calculateMovieFee(Screening screening){
        if(discountPolicy == null)
            return fee;
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

     */
    public  Money calculateMovieFee(Screening screening){
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
