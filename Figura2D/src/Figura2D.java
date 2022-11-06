package src;

import Ponto2D.src.Ponto2D;

public  abstract class Figura2D {
    private Ponto2D cg;

    public Figura2D(Ponto2D cg)
    {
        this.cg = cg;
    }
    public abstract double area();
    public abstract double perimetro();
    
    
    public Ponto2D getCg() {
        return cg;
    }
    public void setCg(Ponto2D cg) {
        this.cg = cg;
    }
    
   
   
}
