package com.company.chapter7;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.Arrays;

// (하향식 접근)
// 급여를 계산하는 프로그램
/*
급여를 계산한다
->
급여를 계산한다
    사용자로부터 소득세율을 입력받는다
    직원의 급여를 계산한다
    양식에 맞게 결과를 출력한다

 */
public class functional_decomposition {
    int testRate = 1;
    String[] name = {"직원A","직원B"};
    int[] taxs = {100,200};
    public void main(){
        int testRate = getTestRate();
        String user_name = "Input value";
        int pay  = calculatePayFor(user_name,testRate);
        describeResult(user_name,pay);
    }

    private void describeResult(String name, int pay) {
        System.out.println(name+ " " +pay);
    }

    private int calculatePayFor(String user_name, int testRate) {
        for(int i=0;i<name.length;i++){
            if(name[i].equals(user_name))
                return taxs[i] - taxs[i]*testRate;
        }
        return 0;
    }

    public int getTestRate() {
        return testRate;
    }
}
