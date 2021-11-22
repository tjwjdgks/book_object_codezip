package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 세율을 부과해야 하는 변경 사항
public class Phone {
    protected Money amount;
    protected Duration seconds;
    protected List<Call> calls = new ArrayList<>();

    protected double taxRate;
    public Phone(Money amount, Duration seconds, double taxRate) {
        this.amount = amount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public void call(Call call){
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public Money calculateFee(){

        Money result = Money.ZERO;
        for(Call call : calls){
            result = result.plus(amount.times(call.getDuration().getSeconds()/seconds.getSeconds()));
        }
        // 세율 계산 중복 작업 1
        return result.plus(result.times(taxRate));
    }
}
