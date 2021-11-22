package com.company.chapter10;

import com.company.chapter2.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// 세율을 부과해야 하는 변경 사항
// 자식 클래스 사이의 공통점은 부모 클래스로 옮긴다.
// 실제 부모의 구현을 의존하는 것이 아닌 추상화된 객체를 의존한다.
public abstract class Phone {

    private List<Call> calls = new ArrayList<>();

    // 변경 사항 추가 1
    protected double taxRate;
    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    public void call(Call call){
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }
    public Money calculateFee(){

        Money result = Money.ZERO;
        for(Call call : calls){
            result.plus(calculateCallFee(call));
        }
        // 세율 계산 중복작업 2
        return result.plus(result.times(taxRate));
    }
    protected abstract Money calculateCallFee(Call call);
}
