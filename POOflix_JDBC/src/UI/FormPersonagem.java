package UI;

import java.io.Console;
import CDU.*;

public class FormPersonagem extends Form{
    private String id;
    private String nome;    
    private CDUcadastraPers cduP;

    public void setCDU(CDUcadastraPers cduP)
    {
        this.cduP = cduP;
    }

    public void exibe()
    {
        Console c = System.console();
        boolean termina = false;
        String continuar;
        System.out.println("Cadastrando personagem\n");

        while(!termina)
        {
            id = c.readLine("ID: ");
            nome = c.readLine("Nome: ");

            continuar = c.readLine("Deseja continuar?<s/n> ");
            termina = continuar.toLowerCase().equals('n');

            if(!termina)
            {
                cduP.SalvaPers();
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

    

}

