package Ponto2D.src;


public class TestaRetangulo {
    
   public static void main(String[] args) throws Exception{ 
    Retangulo r1 = new Retangulo(new Ponto2D(50, 50), new Ponto2D(100, 85));

    Ponto2D p1 = new Ponto2D(72, 65);
    Ponto2D p2 = new Ponto2D(101, 65);

    System.out.println("Estado do Objeto");
    System.out.println(r1 + "\n");
    System.out.println("Area: " + r1.area());
    System.out.println("Perimetro: " + r1.perimetro());
    System.out.println("Eh quadrado: " + r1.is_quadrado());
    System.out.print("O ponto P1 com X " + p1.getX() + "e Y " + p1.getY() + "esta no seu interior? ");
    System.out.println(r1.pertence(p1) + "\n\n");
    System.out.print("O ponto P2 com X " + p2.getX() + "e Y " + p2.getY() + "esta no seu interior? ");
    System.out.println(r1.pertence(p2) + "\n\n");

    }
}
