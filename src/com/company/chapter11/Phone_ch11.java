package com.company.chapter11;

import com.company.chapter10.Call;
import com.company.chapter2.Money;

import java.util.ArrayList;
import java.util.List;


public class Phone_ch11 {

    private RatePolicy_ch11 ratePolicy;
    private List<Call_ch11> calls = new ArrayList<>();

    public Phone_ch11(RatePolicy_ch11 ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public void call(Call_ch11 call){
        calls.add(call);
    }

    public List<Call_ch11> getCalls() {
        return calls;
    }
    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}
