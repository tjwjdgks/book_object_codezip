package com.company.chapter7;

class Employee{
    int taxRate;
    String name;
    int tax;

    public Employee(int taxRate, String name, int tax) {
        this.taxRate = taxRate;
        this.name = name;
        this.tax = tax;
    }
    private void describeResult(String name, int pay) {
        System.out.println(name+ " " +pay);
    }
    public int calculatePayFor(int taxRate) {
        return 0;
    }
    public void show(){
        int pay = calculatePayFor(taxRate);
        describeResult(name,pay);
    }
}
class A extends Employee{

    public A(int taxRate, String name, int tax) {
        super(taxRate, name, tax);
    }
    @Override
    public int calculatePayFor(int taxRate) {
        return tax - taxRate*tax/2;
    }

}
class B extends Employee{

    public B(int taxRate, String name, int tax) {
        super(taxRate, name, tax);
    }
    @Override
    public int calculatePayFor(int taxRate) {
        return  tax - taxRate*tax/3;
    }
}
public class obejct_orient {
    public void main(){
        Employee A = new A(1,"A",100);
        Employee B = new B(1,"B",200);
        A.show();
        B.show();
    }

}
