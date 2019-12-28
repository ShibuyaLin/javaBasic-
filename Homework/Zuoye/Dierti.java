package Zuoye;

public class Dierti implements Timu,Xuanxiang,Daan{
    private String e;
    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
    @Override
    public void da(String e) {
        if (e=="C"){
            System.out.println(e+"\t"+"答案正确");
        }
        else{
            System.out.println(e+"\t"+"答案错误");
        }
    }

    @Override
    public void zong(int a, String b) {
        System.out.println(a+"."+b);
    }

    @Override
    public void xuan(String a, String b, String c, String d) {
        System.out.println("A." +a +"\t" + "B." + b + "\t" + "C." + c + "\t" + "D." + d);
    }
}
