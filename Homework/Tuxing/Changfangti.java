package Tuxing;

public class Changfangti extends Ju {
    public int getGao() {
        return gao;
    }

    public void setGao(int gao) {
        this.gao = gao;
    }

    int gao;
    public String toString(){
        return "长:"+getChang()+"\t"+"宽:"+getKuan()+"\t"+"高:"+getGao()+"\t"+"体积:"+getKuan()*getGao()*getChang();
    }
}
