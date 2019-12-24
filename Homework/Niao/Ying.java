package Niao;

public class Ying extends Niao {
    private String bushi;

    public String getBushi() {
        return bushi;
    }

    public void setBushi(String bushi) {
        this.bushi = bushi;
    }

    public int getFeixinggaodu() {
        return feixinggaodu;
    }

    public void setFeixinggaodu(int feixinggaodu) {
        this.feixinggaodu = feixinggaodu;
    }

    private int feixinggaodu;
    public String toString(){
        return "翅膀"+getChi()+"\t"+"腿"+getTui()+"\t"+"捕食"+bushi+"\t"+"飞行高度"+feixinggaodu;
    }
}
