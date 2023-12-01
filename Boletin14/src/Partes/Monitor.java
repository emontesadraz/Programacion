package Partes;

public class Monitor {
    private int hz;

    public Monitor() {
    }

    public Monitor(int hz) {
        this.hz = hz;
    }

    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    @Override
    public String toString() {
        return "Monitor{" + "hz=" + hz + '}';
    }
    
}


