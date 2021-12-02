package com.company.chapter13;

// 직사각형 클라이언트의 행동 사각형의 너비와 높이가 다르다고 가정
public class RectangleClient {


    public void resize(Rectangle rectangle, int height, int width){
        rectangle.setHeight(width);
        rectangle.setWidth(height);
        // 문제 발생
        assert rectangle.getHeight() == height && rectangle.getWidth() == width;
    }
}
