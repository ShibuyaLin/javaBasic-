package computer;

public class main {
    public static void main(String[] args) {
        Compute compute=new JIA();
        UseCompute useCompute=new UseCompute();
        useCompute.useCom(compute,1,3);
    }
}
