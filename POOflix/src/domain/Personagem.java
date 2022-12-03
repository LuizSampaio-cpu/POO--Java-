package domain;

import java.util.LinkedList;

public class Personagem implements OBJPOOFlix{
    private String id;
    private String nome;
    private LinkedList<Performance> performances;
    
    public Personagem(String id, String nome) {
        this.id = id;
        this.nome = nome;
        performances = new LinkedList<Performance>();
    }

    public void addPerformance(Performance p)
    {
        performances.add(p);
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

    
}