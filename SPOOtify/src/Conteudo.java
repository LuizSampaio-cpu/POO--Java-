package src;

public abstract class Conteudo{
    //atributos
    private String titulo;

    private double duracao;

    //constructor
    public Conteudo (String titulo, double duracao)
    {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    //metodos
    public String getTitulo()
    {
        return titulo;
    }
    public double getDuracao()
    {
        return duracao;
    }

    public void setTitulo(String titulo)
    {
       this.titulo = titulo;
    }
    public void setDuracao(double duracao)
    {
        this.duracao = duracao;
    }
}