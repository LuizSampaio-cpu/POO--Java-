package domain;

import java.util.LinkedList;

public class Ator implements OBJPOOFlix{
    private String id;
    private String nome;
    private String nacionalidade;
    private LinkedList<Performance> trabalhos;
    
    public Ator(String id, String nome, String nacionalidade, LinkedList<Performance> trabalhos) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        trabalhos = new LinkedList<Performance>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LinkedList<Performance> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(LinkedList<Performance> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public void addPerformance(Performance p)
    {
        trabalhos.add(p);
    }
}