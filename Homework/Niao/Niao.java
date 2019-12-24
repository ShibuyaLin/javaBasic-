package Niao;
public class Niao {
    private boolean chi=true;
    private int tui=2;

    public boolean getChi() {
        return chi;
    }

    public void setChi(boolean chi) {
        this.chi = chi;
    }

    public int getTui() {
        return tui;
    }

    public void setTui(int tui) {
        this.tui = tui;
    }
        public String toString(){
        return "翅膀"+getChi()+"\t"+"腿"+getTui();
        }

}
