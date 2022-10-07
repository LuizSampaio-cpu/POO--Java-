package src;


public class Automovel {
    private double comprimento;
    private double altura;
    private double peso;
    private double peso_maximo;
    private int max_pass;
    private int pas_atual;
    private double max_tanque;
    private double l_atuais;
    private double velocidade_atual;
    private boolean ligado;




    public Automovel (double comprimento, double altura, double peso, double peso_maximo, int max_pass, int pas_atual, double max_tanque, double l_atuais, double vel_atual, 
    boolean ligado)
    {
        this.comprimento = comprimento;
        this.altura = altura;
        this.peso = peso;
        this.peso_maximo = peso_maximo;
        this.max_pass = max_pass;
        this.pas_atual = pas_atual;
        this.max_tanque = max_tanque;
        this.l_atuais = l_atuais;
        this.velocidade_atual = vel_atual;
        this.ligado = ligado;


    }

    public double getComp() { return comprimento; }

    public double getAltura() { return altura; }

    public double getPeso() { return peso; }

    public double getPesomax() { return peso_maximo; }

    public int getMaxPass() { return max_pass; }

    public int getPass_atual() { return pas_atual; }

    public double getMax_tanque() { return max_tanque; }

    public double getL_atuais() { return l_atuais; }

    public double getVel() { return velocidade_atual; }

    public boolean getLigado() { return ligado; }

    public double aceleracao(double vel_final)
    {

        if (getLigado() == true)
        {
            double atual = getVel();
            velocidade_atual = vel_final;
            if(velocidade_atual > atual)
            {
                System.out.println("acelerando...");
                return velocidade_atual;
            }
            else {
                System.out.println("freiando...");
                return velocidade_atual;
            }
            
        }
        else {
            velocidade_atual = 0;
            System.out.println("Carro desligado...");
        }
        return velocidade_atual;


    }

    public boolean checa_peso(double combustivel, int pessoas)
    {
        double peso_l = abastece(combustivel);
        int peso_pessoas = EmbarqueDesembarque(pessoas);
        if (getPesomax() < (peso_pessoas * 80) + peso_l)
        {
            System.out.println("Peso máximo excedido...");
            return false;
        }
        else
        {
            System.out.println("Desembarcando pessoas...");
            return true;
        }
    }

    public double abastece(double combustivel)
    {
        double l_final = 0;
        if(getL_atuais() + combustivel <= getMax_tanque())
        {
            l_final = getL_atuais() + combustivel;
            return l_final;
        }
        else {
            System.out.println("Capacidade excede o máximo permitido..");
            return getL_atuais();
        }
    }

    public int EmbarqueDesembarque(int pessoas)
    {
        int passageiros = getPass_atual();
        if(getLigado() == false){
            if((passageiros + pessoas <= getMaxPass()) && (passageiros + pessoas > getPass_atual()) && getLigado() )
            {
                System.out.println("Embarcando pessoas...");
                passageiros = pessoas + passageiros;
                return passageiros;
            }
            if((passageiros + pessoas > getPass_atual()) && passageiros + pessoas >= 0 && getLigado()){
                System.out.println("Desembarcando pessoas...");
                passageiros = pessoas + passageiros;
                return passageiros;
            }
        return passageiros;
        }
        else{
            System.out.println("Desligue o carro primeiro...");
            return passageiros;
        }

    }

    public String toString(){
        return "Comprimento: {"+getComp()+"}\nAltura: {"+getAltura()+"}\nPeso: {"+getPeso()+"}\nMax. Carga:{"+getPesomax()+"}\nMax. Passageiros: {"+getMaxPass()+
        "}\nPassageiros atualmente no veiculo:{"+getPass_atual()+"}";
    }
}