package src;

import Ponto2D.src.Ponto2D;




public class Circulo extends Figura2D {
    private double raio;

    private Circulo (Ponto2D cg, double raio)
    {
        super(cg);
        this.raio = raio;
    }
    
}
