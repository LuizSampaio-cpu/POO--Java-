package src;

public abstract class Veiculo_linha {
    //atributos
    private int peso;
    private int largura;
    private int altura;
    private int comp;
    private int peso_max;

    //constructor
    public Veiculo_linha (int peso, int largura, int altura, int comp, int peso_max) throws Exception
    {
        this.peso = peso;
        this.largura = largura;
        this.altura = altura;
        this.comp = comp;
        this.peso_max = peso_max;
        try{ /*nova exception criada */
            if ((peso <= 0) || (largura <= 0) || (altura <= 0) || (comp <= 0) || (peso_max <= 0)){
                throw new Exception("Dados negativos nao sao permitidos");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

    //métodos
    public int PesoTotal(int carga)
    {
       return peso + carga;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getPeso_max() {
        return peso_max;
    }

    public void setPeso_max(int peso_max) {
        this.peso_max = peso_max;
    }
    

    
}
