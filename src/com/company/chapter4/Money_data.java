package com.company.chapter4;

import java.math.BigDecimal;

public class Money_data {
    public static final Money_data ZERO = Money_data.wons(0);

    private final BigDecimal amount;

    public static Money_data wons(long amount){
        return new Money_data(BigDecimal.valueOf(amount));
    }
    public static Money_data wons(double amount){
        return new Money_data(BigDecimal.valueOf(amount));
    }

    Money_data(BigDecimal amount){
        this.amount = amount;
    }

    public Money_data plus(Money_data amount){
        return new Money_data(this.amount.add(amount.amount));
    }
    public Money_data minus(Money_data amount){
        return new Money_data(this.amount.subtract(amount.amount));
    }
    public Money_data times(double persent){
        return new Money_data(this.amount.multiply(BigDecimal.valueOf(persent)));
    }
    public boolean isLessThan(Money_data other){
        return amount.compareTo(other.amount) < 0;
    }
    public boolean isGreaterThanOrEqual(Money_data other){
        return amount.compareTo(other.amount) >= 0;
    }
}
