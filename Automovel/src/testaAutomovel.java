package src;

public class testaAutomovel {
    
    public static void main( String args[])
    {
        Automovel carro = new Automovel(5.6, 2, 800, 700, 5, 3, 50, 30, 0, true);
        carro.EmbarqueDesembarque(1); //motorista embarca
        System.out.println("Carro ligado");
        carro.aceleracao(70); //acelera até 70 kmh
        carro.EmbarqueDesembarque(6);
        carro.abastece(50);
        carro.EmbarqueDesembarque(-5);
        carro.aceleracao(-50);
    }
}
