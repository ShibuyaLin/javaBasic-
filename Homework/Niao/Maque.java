package Niao;

public class Maque extends Niao {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    private int age;
    private int kg;

    public String toString(){
        return "翅膀"+getChi()+"\t"+"腿"+getTui()+"\t"+"体重"+getKg()+"\t"+"年龄"+getAge();
    }

}
