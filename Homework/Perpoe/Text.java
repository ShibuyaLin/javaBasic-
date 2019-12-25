package Perpoe;

public class Text {
    public  void  payWage(ColaEmployee emp,int month){

        
    }

    public static void main(String[] args) {
        SalariedEmployee gu=new SalariedEmployee();
        gu.setHourlyEmployee(5000);
        gu.getSalary(5000);

        SalesEmployee xiao=new SalesEmployee();
        xiao.setTicheng(0.5);
        xiao.setXiaoshou(20000);
        xiao.getSalary(1);

        HourlyEmployee s=new HourlyEmployee();
        s.setWlokmaney(50);
        s.setWloktime(200);
        s.getSalary(1);
        ColaEmployee[] ss={gu,xiao,s};
        for (ColaEmployee q:ss){

        }


    }


}
