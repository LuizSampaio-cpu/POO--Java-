package CDU;
import UI.*;
//import java.io.Console;
import domain.*;
import persistencia.DAOAtor;
import java.sql.Connection;

public class CDUcadastraAtor extends CDU {
    private Ator ator;
    private FormAtor formAtor;

    public CDUcadastraAtor(FormAtor formAtor, Connection cnxaobd)
    {
        this.formAtor = formAtor;
        this.formAtor.setCDU(this);
        conexaobd = cnxaobd;
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
        DAOAtor dao= DAOAtor(conexaobd);
        int result = dao.adiciona(ator);
        System.out.println("Salvando no banco de dados");
        if (result == 0)
        {
            System.out.println("Ator cadastrado com sucesso");
        }
        else 
            System.out.println("Problemas ao cadastrar o ator");

    }
    
}
