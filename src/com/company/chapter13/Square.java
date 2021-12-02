package com.company.chapter13;

public class Square  extends Rectangle{
    public Square(int x, int y, int size) {
        super(x, y, size, size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public int getArea() {
        return super.getHeight()*super.getWidth();
    }
}
