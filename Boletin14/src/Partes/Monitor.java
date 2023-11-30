package Partes;


public class Monitor {
    private float Hz;
  
    public Monitor() {
    }

    public Monitor(float Hz) {
        this.Hz = Hz;
    }

    public float getHz() {
        return Hz;
    }

    
    public void setHz(float Hz) {
        this.Hz = Hz;
    }

   
    @Override
    public String toString() {
        return "Monitor{" + "Hz=" + Hz + '}';
    }
    public void amosarHz(){
        
    }
}