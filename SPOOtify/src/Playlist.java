package src;

import java.util.ArrayList;

public class Playlist {
    //atributos
    private String nome;
    private int horas;
    private int minutos;
    private int segundos;
    ArrayList<Musica> musicas;
    ArrayList<Podcast> podcasts;
    ArrayList<Audiolivro> audiolivros;

    //constructor
    public Playlist(String nome)
    {
        this.nome = nome;
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.musicas = new ArrayList<>();
        this.podcasts = new ArrayList<>();
        this.audiolivros = new ArrayList<>();
    }

    //metodos
    public ArrayList<Musica> novaMusica(Musica msc)
    {
        musicas.add(msc);
        return musicas;
    }
    
    public ArrayList<Podcast> novoPodcast(Podcast pdc)
    {
        podcasts.add(pdc);
        return podcasts;
    }
    public ArrayList<Audiolivro> novoLivro(Audiolivro lvr)
    {
        audiolivros.add(lvr);
        return audiolivros;
    }
    

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getHoras()
    {
        return horas;
    }
    public void setHoras(int horas)
    {
        this.horas = horas;
    }
    public int getMinutos()
    {
        return minutos;
    }
    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }
    public int getSegundos()
    {
        return segundos;
    }
    public void setSegundos(int segundos)
    {
        this.segundos = segundos;
    }

}