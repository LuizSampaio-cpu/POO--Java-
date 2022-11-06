package src;


public abstract class Conteudo{
    //atributos
    private String titulo;

    private double duracao;

    //constructor
    public Conteudo (String titulo, double duracao) throws Exception
    {
        this.titulo = titulo;
        this.duracao = duracao;
        try{ /*nova excpetion criada*/
            if(titulo == null || duracao == 0)
            {
                throw new Exception("Dados de conetudo invalidos");
            }
        }catch(Exception e){
            System.out.println(e);
        }
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