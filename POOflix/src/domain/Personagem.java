package domain;

import java.util.LinkedList;

public class Personagem {
    private int id;
    private String nome;
    private LinkedList<Performance> performances;
    
    public Personagem(int id, String nome) {
        this.id = id;
        this.nome = nome;
        performances = new LinkedList<Performance>();
    }

    public void addPerformance(Performance p)
    {
        performances.add(p);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}