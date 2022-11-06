package src;

import Ponto2D.src.Ponto2D;




public class Circulo extends Figura2D {
    private double raio;

    private Circulo (Ponto2D cg, double raio)
    {
        super(cg);
        this.raio = raio;
    }


    public double area()
    {
        double area = 3.14 * (raio * raio);
        return area;
    }

    public double perimetro()
    {
        double perimetro = 3.14 * 2 * raio;
        return perimetro;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
