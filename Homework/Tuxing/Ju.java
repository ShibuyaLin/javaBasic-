package Tuxing;

public class Ju {
    private int chang;

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    private int kuan;
    public String toString(){
        return "长:"+getChang()+"\t"+"宽:"+getKuan()+"\t"+"面积:"+chang*kuan;
    }
}
