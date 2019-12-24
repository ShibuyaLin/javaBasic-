package Niao;

public class Tuoniao extends Niao {
    private double shengao;

    public double getShengao() {
        return shengao;
    }

    public void setShengao(double shengao) {
        this.shengao = shengao;
    }

    public int getBenpaosude() {
        return benpaosude;
    }

    public void setBenpaosude(int benpaosude) {
        this.benpaosude = benpaosude;
    }

    private int benpaosude;
    public String toString(){
        return "翅膀"+getChi()+"\t"+"腿"+getTui()+"\t"+"身高"+getShengao()+"\t"+"奔跑速度"+getBenpaosude();
    }
}
