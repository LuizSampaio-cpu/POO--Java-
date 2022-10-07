package src;

import java.util.ArrayList;


public class Musica extends Conteudo {
    //atributos
    private String genero;
    ArrayList<String> Comp;
    ArrayList<String> Inter;

    //constructor
    public Musica(String titulo, double duracao, String genero)
    {
        super(titulo, duracao);
        this.genero = genero;
        this.Comp = new ArrayList<>();
        this.Inter = new ArrayList<>();
    }

    //metodos
    public ArrayList<String> novoCompositor(String compositor)//adiciona novo compositor
    {
        Comp.add(compositor);
        return Comp;
    }
    public ArrayList<String> novoInterprete(String interprete)//adiciona novo interprete
    {
        Inter.add(interprete);
        return Inter;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
       this.genero = genero;
    }

    public ArrayList<String> getComp()
    {
        return Comp;
    }
    
    public ArrayList<String> getInter()
    {
        return Inter;
    }
    
    
}
