package com.company.chapter4;

public class Rectangle_data {
    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle_data(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getRight() {
        return right;
    }

    public int getBottom() {
        return bottom;
    }
    // 개선된 코드
    public void enlarge(int mulitple){
        right *= mulitple;
        left *= mulitple;
    }
}
