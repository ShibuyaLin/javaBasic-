package Perpoe;
//固定工资
public  class SalariedEmployee extends  ColaEmployee{


    public int getHourlyEmployee() {
        return HourlyEmployee;
    }

    public void setHourlyEmployee(int hourlyEmployee) {
        HourlyEmployee = hourlyEmployee;
    }

    private int HourlyEmployee;
    @Override
    public void getSalary(int month) {
        System.out.println("固定工资："+getHourlyEmployee());
    }
}
