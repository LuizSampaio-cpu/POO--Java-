package src;
import Ponto2D.src.Ponto2D;
public class TestaFig2d {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(new Ponto2D(0, 50), new Ponto2D(50, 0));
        Retangulo r2 = new Retangulo(new Ponto2D(80, 60), new Ponto2D(80, 0));
    
    
        System.out.println("area: " + r1.area());
        System.out.println("area 2: " + r2.area());
    
    }
}
