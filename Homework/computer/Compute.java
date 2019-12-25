package computer;

public interface Compute {
    default int computer(int n, int m) {
        return 0;
    }
}
