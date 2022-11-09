package domain;

import java.util.LinkedList;

public class Episodio {
    private String id;
    private String titulo;
    private String resumo;
    private int temporada;
    private LinkedList<Performance> performances;
    private Serie serie;


    public Episodio (String id, String titulo, String resumo, int temporada, LinkedList<Performance> performances, Serie serie)
    {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.temporada = temporada;
        this.performances = performances;
        this.serie = serie;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public LinkedList<Performance> getPerformances() {
        return performances;
    }
    public void setPerformances(LinkedList<Performance> performances) {
        this.performances = performances;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        if(serie == null)
            this.serie = serie;
    }

    public String toString()
    {
        String s = "";
        s = "id: "+getId()+";\n";
        s = s+"Titulo: "+getTitulo()+";\n";
        s = s+String.valueOf(temporada);
        return s;
    }
    
}
