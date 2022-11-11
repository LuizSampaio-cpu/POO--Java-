package CDU;
import UI.*;
import java.io.Console;
import domain.*;

public class CDUcadastraAtor extends CDU {
    private Ator ator = null;
    private FormAtor formAtor;

    public CDUcadastraAtor(FormAtor formAtor)
    {
        this.formAtor = formAtor;
        this.formAtor.setCDU(this);
    }
    public void exec()
    {
        formAtor.exibe();
    }

    public String getNomeAtor()
    {
        return "Algum nome aí";
    }

    public void salvaAtor()
    {
        String id = formAtor.getId();
        String nome = formAtor.getNome();
        String nacionalidade = formAtor.getNacionalidade();

        ator = new Ator(id, nome, nacionalidade, null);

        System.out.println("Salvando no banco de dados");
    
    }
    
}
