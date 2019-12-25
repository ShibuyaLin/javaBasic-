package Work25.Yeqi;

public class Wind implements Instrument {
    @Override
    public void Play() {
        System.out.println("弹奏Wind");
    }
    public void playWind(){
        System.out.println("调用wind的play2方法");
    }
}
