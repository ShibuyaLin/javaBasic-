package Niao;

public class Main {
    public static void main(String[] args) {
        Niao niao=new Niao();
        niao.setChi(true);
        niao.setTui(2);
        System.out.println(niao);
        Maque que=new Maque();
        que.setAge(1);
        que.setKg(10);
        System.out.println(que);
        Tuoniao tuo=new Tuoniao();
        tuo.setBenpaosude(23);
        tuo.setShengao(1.85);
        System.out.println(tuo);
        Ying ying=new Ying();
        ying.setBushi("麻雀");
        ying.setFeixinggaodu(30);
        System.out.println(ying);
    }
}
