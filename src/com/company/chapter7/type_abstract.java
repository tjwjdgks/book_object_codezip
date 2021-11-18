package com.company.chapter7;


public class type_abstract {
    int taxRate = 1;
    String[] name = {"직원A","직원B"};
    int[] taxs = {100,200};

    public void main(){
        int testRate = getTaxRate();
        String user_name = "Input value";
        int pay  = calculatePayFor(taxRate);
        describeResult(user_name,pay);
    }

    private void describeResult(String name, int pay) {
        System.out.println(name+ " " +pay);
    }

    private int calculatePayFor(int taxRate) {
        for(int i=0;i<name.length;i++){
            if(name[i].equals("직원A"))
                return calculatePayForA(taxs[i],taxRate);
            else if(name[i].equals("직원B"))
                return calculatePayForB(taxs[i],taxRate);
            else return 0;

        }
        return 0;
    }

    private int calculatePayForB(int tax, int taxRate) {
        return tax - tax*taxRate;
    }

    private int calculatePayForA(int tax, int taxRate) {
        return tax - tax*taxRate/2;
    }

    public int getTaxRate() {
        return taxRate;
    }
}
