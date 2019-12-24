package Tuxing;

public class Heroin {
    public static void main(String[] args) {
        Ju juxing=new Ju();
        juxing.setChang(10);
        juxing.setKuan(5);
        System.out.println(juxing);
        Changfangti fang=new Changfangti();
        fang.setGao(10);
        fang.setChang(15);
        fang.setKuan(5);
        System.out.println(fang);
//      长方体
            Ju changfangti=new Ju();
            changfangti.setKuan(5);
            changfangti.setChang(20);
        System.out.println("长方体："+changfangti);
            Changfangti changfangt=new Changfangti();
            changfangt.setKuan(5);
            changfangt.setGao(10);
            changfangt.setChang(20);
        System.out.println("长方体："+changfangt);

    }
}
