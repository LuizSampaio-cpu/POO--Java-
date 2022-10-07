package Ponto2D.src;

public class Ponto2D {
    private int x;
    private int y;

    public Ponto2D (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto2D pontoB)
    {
        return Math.sqrt(Math.pow(x- pontoB.getX(),2) + Math.pow(y-pontoB.getY(), 2));
    }
    public boolean igual (Ponto2D pontoB)
    {
        return x == pontoB.getX() && y == pontoB.getY();
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    public String toString(){
        return "X= "+ getX() +" Y= "+getY();
    }
}