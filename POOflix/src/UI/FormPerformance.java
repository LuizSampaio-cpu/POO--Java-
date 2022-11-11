package UI;

import java.io.Console;

import domain.*;
import CDU.*;

public class FormPerformance extends Form {
    private Ator ator;
    private String idPersonagem;
    private Episodio episodio;
    private CDUcadastraPerformance cduPf;

    public void setCDU(CDUcadastraPerformance cduPf)
    {
        this.cduPf = cduPf;
    }

    public void exibe()
    {
        Console c = System.console();
        boolean termina = false;
        String continuar;
        boolean lePerf = true;
        String nomeAtor = null;

        System.out.println("Cadastrando performance");

        while(!termina)
        {
            if(lePerf)
            {
                idPersonagem = c.readLine("ID personagem: ");
                nomeAtor = c.readLine("Nome do ator: ");
                lePerf = nomeAtor != null;

                if(nomeAtor == null)
                {
                    System.err.println("Ator não existe");
                    lePerf = true;
                    termina = false;
                }

            }
        }
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public String getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(String idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public Episodio getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Episodio episodio) {
        this.episodio = episodio;
    }

    
}
