package com.company.chapter4;

// 어딘가에서 너비와 높이 증가하는 코드
//
public class Use_Rectangle {
    void anyMethod(Rectangle_data rectangle, int multiple){
        // 이전의 코드
        /*
        rectangle.setRight(rectangle.getRight()*multiple);
        rectangle.setBottom(rectangle.getBottom()*multiple);
         */

        // 개선된 코드
        rectangle.enlarge(multiple);
    }
}
