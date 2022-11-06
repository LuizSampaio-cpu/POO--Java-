package src;

import Ponto2D.src.Ponto2D;

public class Retangulo extends Figura2D{

    private Ponto2D ES;
    private Ponto2D DI;

    public Retangulo(Ponto2D cg, Ponto2D eS, Ponto2D dI) throws Exception{
        super(cg);
        ES = eS;
        DI = dI;
        try{ /*nova Excpetion criada */
            if (area() == 0)
            {
                throw new Exception("Area do retangulo igual a zero");
            }
        }
        catch (Exception e){
            System.out.println(e);
        };
    }

    public Ponto2D getES() {
        return ES;
    }
    public void setES(Ponto2D eS) {
        ES = eS;
    }
    public Ponto2D getDI() {
        return DI;
    }
    public void setDI(Ponto2D dI) {
        DI = dI;
    }

    public double area()
    {
       double altura = ES.getY() - DI.getY();
       double base = ES.getX() - DI.getX();
       return base * altura;
    }
    public double perimetro()
    {
        double altura = ES.getY() - DI.getY();
        double base = ES.getX() - DI.getX();
        return (base + altura) * 2;
    }
    
}
