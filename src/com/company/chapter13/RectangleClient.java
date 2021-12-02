package com.company.chapter13;

// 직사각형 클라이언트의 행동 사각형의 너비와 높이가 다르다고 가정
public class RectangleClient {


    public void resize(RegularRectangle rectangle, int height, int width){
        rectangle.setHeight(width);
        rectangle.setWidth(height);
        // 문제 발생 ==> 클라이언트에 행동에 맞춘 클래스로 변경
        assert rectangle.getHeight() == height && rectangle.getWidth() == width;
    }
}
