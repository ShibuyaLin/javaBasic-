package Perpoe;
//小时工资
public  class HourlyEmployee extends ColaEmployee {
    public void getSalary(int month){
        if (getWloktime()<=160){
            System.out.println("未超过160小时工资："+getWlokmaney()*getWloktime());
        }else if (getWloktime()>160){
            System.out.println("超过160小时工资："+160*getWlokmaney()+((getWloktime()-160)*(getWlokmaney()*1.5)));
        }
    }
    public void as(){ if (getWloktime()<=160){
        System.out.println("未超过160小时工资："+getWlokmaney()*getWloktime());
    }else if (getWloktime()>160){
        System.out.println("超过160小时工资："+(160*getWlokmaney())+((getWloktime()-160)*(getWlokmaney()*1.5)));
    }}
    public int getWlokmaney() {
        return wlokmaney;
    }

    public void setWlokmaney(int wlokmaney) {
        this.wlokmaney = wlokmaney;
    }

    public int getWloktime() {
        return wloktime;
    }

    public void setWloktime(int wloktime) {
        this.wloktime = wloktime;
    }

    //    每小时工钱
    private int wlokmaney;
//    工作时间
    private int wloktime;

}
