package Work25.Yeqi;

public class Brass implements Instrument {
    @Override
    public void Play() {
        System.out.println("弹奏Brass");
    }
    public void playBrass(){
        System.out.println("调用Brass的play2方法");
    }

}
