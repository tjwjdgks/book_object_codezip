package com.company.chapter11;

import com.company.chapter2.Money;

public interface RatePolicy_ch11 {
    Money calculateFee(Phone_ch11 phone);
}
