package Perpoe;

public class Text {
    public  void  payWage(ColaEmployee emp,int month){
        System.out.println(emp);
    }

    public static void main(String[] args) {
        SalariedEmployee gu=new SalariedEmployee();
        System.out.println(gu.toString());
        SalesEmployee xiao=new SalesEmployee();
        xiao.setTicheng(0.9);
        xiao.setXiaoshou(1000);
        System.out.println(xiao.toString());
        HourlyEmployee s=new HourlyEmployee();
        s.setWlokmaney(1);
        s.setWloktime(180);
        s.as();

    }


}
