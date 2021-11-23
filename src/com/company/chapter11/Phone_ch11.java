package com.company.chapter11;

import com.company.chapter10.Call;
import com.company.chapter2.Money;

import java.util.ArrayList;
import java.util.List;


public abstract class Phone_ch11 {

    private List<Call_ch11> calls = new ArrayList<>();

    public void call(Call_ch11 call){
        calls.add(call);
    }

    public List<Call_ch11> getCalls() {
        return calls;
    }
    public Money calculateFee(){

        Money result = Money.ZERO;
        for(Call_ch11 call : calls){
            result.plus(calculateCallFee(call));
        }
        // 세율 계산 중복작업 2
        return result;
    }
    protected abstract Money calculateCallFee(Call_ch11 call);
}
