package UI;

import java.io.Console;
import CDU.*;


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
                cducs.salvaSerie();
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

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdademin(String idademin) {
        this.idademin = idademin;
    }

    public void setCDU(CDUcadastraSerie cducs)
    {
        this.cducs = cducs;
    }
    

}