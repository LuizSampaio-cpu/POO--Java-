package src;
import java.lang.Math;
import Ponto2D.src.Ponto2D;

public class Triangulo extends Figura2D {
    private Ponto2D v1;
    private Ponto2D v2;
    private Ponto2D v3;
   
    public Triangulo(Ponto2D cg, Ponto2D v1, Ponto2D v2, Ponto2D v3) {
        super(cg);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double area()
    {
        double p = (v1.distancia(v2) + v1.distancia(v3) + v2.distancia(v3))/2;
        return Math.sqrt(p *(p - v1.distancia(v2)) * (p - v1.distancia(v3)) * (p - v2.distancia(v3)) );
    }

    public double perimetro()
    {
        double perim = v1.distancia(v2) + v1.distancia(v3) + v2.distancia(v3);
        return perim;

    }

    public Ponto2D getV1() {
        return v1;
    }

    public void setV1(Ponto2D v1) {
        this.v1 = v1;
    }

    public Ponto2D getV2() {
        return v2;
    }

    public void setV2(Ponto2D v2) {
        this.v2 = v2;
    }

    public Ponto2D getV3() {
        return v3;
    }

    public void setV3(Ponto2D v3) {
        this.v3 = v3;
    }
    

  
    
}
