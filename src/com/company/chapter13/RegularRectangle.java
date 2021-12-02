package com.company.chapter13;

public class RegularRectangle extends Rectangle{

    public RegularRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public int getArea() {
        return super.getHeight()*super.getWidth();
    }
}
