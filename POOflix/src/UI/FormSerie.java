package UI;

import java.io.Console;
import CDU;


public class FormSerie extends Form {
    private String id;
    private String titulo;
    private String idademin;
    private CDUcadastraSerie cducs;

   
    public void exibe()
    {
        Console c = System.console();
        boolean termina = false;
        String continuar;
        System.out.println("CADASTRANDO SÉRIE\n");

        while(!termina)
        {
            id = c.readLine("ID: ");
            titulo = c.readLine("Titulo: ");
            idademin = c.readLine("Idae mínima: ");

            continuar = c.readLine("Dseja continuar? <s/n>: ");
            termina = continuar.toLowerCase().equals("n");

            if(!termina)
            {
                cducs.salvarSerie();
            }
        }

    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdademin() {
        return idademin;
    }


}