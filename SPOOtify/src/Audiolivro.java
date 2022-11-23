package src;

import java.util.ArrayList;

public class Audiolivro extends Conteudo{
    //atributos
    private String editora;
    private String narrador;
    private String resumo;
    ArrayList<String> autores;

    //constructor
    public Audiolivro(String titulo, double duracao, String editora, String narrador,
    String resumo) throws Exception
    {
        super(titulo, duracao);
        this.editora = editora;
        this.narrador = narrador;
        this.resumo = resumo;
        this.autores = new ArrayList<>();
    
    }
    //metodos
    public String geteditora()
    {
        return editora;
    }
    public String getNarrador()
    {
        return narrador;
    }
    public String getResumo()
    {
        return resumo;
    }
    public ArrayList<String> novoAutor(String autor)
    {
        autores.add(autor);
        return autores;
    }
    
    public void setEditora(String editora)
    {
       this.editora = editora;
    }
    public void setNarrador(String narrador)
    {
       this.narrador = narrador;
    }
    public void setResumo(String resumo)
    {
       this.resumo = resumo;
    }
    
    
    
    
}
