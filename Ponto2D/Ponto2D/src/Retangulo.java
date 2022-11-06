package Ponto2D.src;



public class Retangulo {
    private Ponto2D verticeES;
    private Ponto2D verticeDI;


    public Retangulo (Ponto2D es, Ponto2D di) throws Exception{
        verticeES = es;
        verticeDI = di;
        try { /*nova exception criada*/
            if(area() == 0)
            {
                throw new Exception("Area igual a zero");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Ponto2D getES()
    {
        return verticeES;
    }

    public Ponto2D getDI()
    {
        return verticeDI;
    }

    public Ponto2D getDS()
    {
        return new Ponto2D(verticeDI.getX(),verticeES.getY());
    }
    public Ponto2D getEI()
    {
        return new Ponto2D(verticeES.getX(), verticeDI.getY());
    }

    public double perimetro()
    {
        double altura = Math.abs(verticeES.getY()) - Math.abs(verticeDI.getY());
        double largura = Math.abs(verticeES.getX()) - Math.abs(verticeDI.getX());
        return ((largura + altura) * 2);
    }
    public double area()
    {
        double altura = Math.abs(verticeES.getY()) - Math.abs(verticeDI.getY());
        double largura = Math.abs(verticeES.getX()) - Math.abs(verticeDI.getX());
        return (largura * altura);
    }
    public boolean is_quadrado()
    {
        double altura = Math.abs(verticeES.getY()) - Math.abs(verticeDI.getY());
        double largura = Math.abs(verticeES.getX()) - Math.abs(verticeDI.getX());
        return altura == largura;
    }
    public boolean pertence(Ponto2D p)
    {
        boolean in = (p.getX() >= verticeES.getX() && p.getX() <= verticeDI.getX() && p.getY()
        >= verticeES.getY() && p.getY() <= verticeDI.getY());
        return in;
    }

    public String ToString()
    {
        String s = "Canto ES: "+ verticeES.toString() + "\n";
        s = s + "Canto DI: "+ verticeDI.toString() + "\n";
        return s;
    }
}
