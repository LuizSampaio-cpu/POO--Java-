package src;

public class Podcast extends Conteudo{
    //atributos
    private String host;
    private String tema;
    private String resenha;

    //constructor
    public Podcast(String titulo, double duracao, String host, String tema, String resenha)
    {
        super(titulo, duracao);
        this.host = host;
        this.tema = tema;
        this.resenha = resenha;
    }

    //metodos
    public String getHost()
    {
        return host;
    }
    public String getTema()
    {
        return tema;
    }
    public String getResenha()
    {
        return resenha;
    }

    public void setHost(String host)
    {
       this.host = host;
    }
    public void setTema(String tema)
    {
        this.tema = tema;
    }
    public void setResenha(String resenha)
    {
        this.resenha = resenha;
    }
}
