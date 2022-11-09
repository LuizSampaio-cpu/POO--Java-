package UI;

import java.io.Console;

import CDU.CDUcadastraEp;

public class FormEpisodio extends Form {
    private String id;
    private String idserie;
    private String temporada;
    private String ttulo;
    private String resumo;
    private CDUcadastraEp cduce;

    public void setCDU(CDUcadastraEp cduce)
    {
        this.cduce = cduce;
    }

    public void exibe()
    {
        Console c = System.console();
        boolean termina = false;
        String continuar;     
        boolean leserie = true;
        boolean leepisodio = false;  
        String nomeserie = null;

        System.out.println("CADASTRANDO EPISODIO\n");

        while(!termina){
            if(leserie){
                idserie = c.readLine("Qual série?(id): ");
                nomeserie = cduce.getNomeSerie(Integer.parseInt(idserie));
                leepisodio = nomeserie != null;

                if(nomeserie == null) {
                    System.err.println("!!série não existe !!");
                    leserie = true;
                    leepisodio = false;
                    termina = false; 
                }
                }    
            }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdserie() {
        return idserie;
    }

    public void setIdserie(String idserie) {
        this.idserie = idserie;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return ttulo;
    }

    public void setTtulo(String ttulo) {
        this.ttulo = ttulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public CDUcadastraEp getCduce() {
        return cduce;
    }

    public void setCduce(CDUcadastraEp cduce) {
        this.cduce = cduce;
    }
    
    
}