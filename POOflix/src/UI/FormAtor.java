package UI;

import java.io.Console;
import CDU.*;

public class FormAtor extends Form{
    private String id;
    private String nome;
    private String nacionalidade;
    private CDUcadastraAtor cduA;

    public void setCDU(CDUcadastraAtor cduA)
    {
        this.cduA = cduA;
    }

    public void exibe()
    {
        Console c = System.console();
        boolean termina = false;
        String continuar;
        System.out.println("Cadastrando ator")
        
        while(!termina)
        {
            id = c.readLine("ID: ");
            nome = c.readLine("Nome");
            nacionalidade = c.readLine("Nacionalidade");

            continuar = c.readLine("Continuar?<s/n> ");
            termina = continuar.toLowerCase().equals('n');

            if(!termina)
            {
                cduA.salvaAtor();
            }

        }
    
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

    
}
