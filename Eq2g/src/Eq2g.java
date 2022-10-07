package src;

public class Eq2g {
    private int a;
    private int b;
    private int c;

    public Eq2g (int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    public double CalculaDelta() {
        double delta = Math.pow(getB(), 2) - (4 * getA() * getC());
        return delta; 
    }
    
    public int quantRaizes(int quantidade) {
        if (CalculaDelta() >= 0)
        {
            quantidade = 2;
        }
        if (CalculaDelta() < 0)
        {
            quantidade = 0;
        }
        return quantidade;
    }

    public double raizA(double raizA)
    {
        return raizA = ((b * (-1)) + Math.sqrt(CalculaDelta())) / (2 * a);       
    }
    public double raizB(double raizB)
    {
        return raizB = ((b * (-1)) - Math.sqrt(CalculaDelta())) / (2 * a);       
    }

    public String ToString()
    {
        return "Coeficiente A: " + this.a + "  Coeficiente B: " + this.b + "  Coeficiente C: " + this.c; 
    }
}
