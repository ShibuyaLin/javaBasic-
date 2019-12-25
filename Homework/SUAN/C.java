package SUAN;

public interface C extends A,B {
    @Override
    default double area() {
        return 0;
    }

    @Override
    default void setColor(String c) {

    }
    void volume();
}
