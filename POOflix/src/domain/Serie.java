package domain;

import java.util.LinkedList;

public class Serie {
    private int id;
    private String titulo;
    private int clas_idade;
    private LinkedList<Episodio> episodios;
    private Categoria cat;

    public Serie (int id, String titulo, int clas_idade, LinkedList<Episodio> episodios, Categoria cat)
    {
        this.id = id;
        this.titulo = titulo;
        this.clas_idade = clas_idade;
        this.episodios = episodios;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClas_idade() {
        return clas_idade;
    }

    public void setClas_idade(int clas_idade) {
        this.clas_idade = clas_idade;
    }

    public LinkedList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(LinkedList<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    




}
