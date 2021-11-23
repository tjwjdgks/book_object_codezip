package com.company.chapter11;

import com.company.chapter2.Money;

public abstract class BasicRatePolicy_ch11 implements RatePolicy_ch11 {

    @Override
    public  Money calculateFee(Phone_ch11 phone){
        Money result = Money.ZERO;

        for(Call_ch11 call : phone.getCalls()){
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }
    protected abstract Money calculateCallFee(Call_ch11 call);

}
