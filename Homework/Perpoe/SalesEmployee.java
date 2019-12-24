package Perpoe;

import java.sql.SQLOutput;

//提成工资
public class SalesEmployee extends ColaEmployee{

    private int xiaoshou;
    private double ticheng;
    public int getXiaoshou() {
        return xiaoshou;
    }

    public void setXiaoshou(int xiaoshou) {
        this.xiaoshou = xiaoshou;
    }

    public double getTicheng() {
        return ticheng;
    }

    public void setTicheng(double ticheng) {
        this.ticheng = ticheng;
    }
    public String toString(){
        return"效绩工资："+getTicheng()*getXiaoshou() ;
    }
    @Override
    public void getSalary(int month) {
        System.out.println("效绩工资："+getTicheng()*getXiaoshou());
    }
}
