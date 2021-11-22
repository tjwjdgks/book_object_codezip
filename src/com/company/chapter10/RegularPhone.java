package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 세율을 부과해야 하는 변경 사항
public class RegularPhone extends Phone {
    protected Money amount;
    protected Duration seconds;
    protected List<Call> calls = new ArrayList<>();

    // 변경 사항 추가 2
    public RegularPhone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds = seconds;
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

    @Override
    protected Money calculateCallFee(Call call){
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
