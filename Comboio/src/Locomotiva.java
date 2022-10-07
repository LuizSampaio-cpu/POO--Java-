package src;

import java.util.ArrayList;

public class Locomotiva extends Veiculo_linha {
    //atributos
    private int matricula;
    private double potencia;
    private double desloca_carga;
    ArrayList<Veiculo_linha> comboio;
    
    //constructor
    public Locomotiva(int peso, int largura, int altura, int comp, int peso_max, int matricula, double potencia,
            double desloca_carga, ArrayList<Veiculo_linha> comboio) {
        super(peso, largura, altura, comp, peso_max);
        this.matricula = matricula;
        this.potencia = potencia;
        this.desloca_carga = desloca_carga;
        this.comboio = comboio;
    }
    
    //métodos
    public ArrayList<Veiculo_linha> CadastraTanques (Vagao_tanque tnk){
        comboio.add(tnk);
        return comboio;
    }

    public ArrayList<Veiculo_linha> CadastraPass (Vagao_pass pas){
        comboio.add(pas);
        return pas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getDesloca_carga() {
        return desloca_carga;
    }

    public void setDesloca_carga(double desloca_carga) {
        this.desloca_carga = desloca_carga;
    }

    public ArrayList<Veiculo_linha> getComboio() {
        return comboio;
    }

    public void setComboio(ArrayList<Veiculo_linha> comboio) {
        this.comboio = comboio;
    }    
    
}
