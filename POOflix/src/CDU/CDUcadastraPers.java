package CDU;

import domain.*;
import UI.*;
import persistencia.DAOPersonagem;
import java.sql.Connection;

public class CDUcadastraPers extends CDU{
    private Personagem personagem;
    private FormPersonagem formPersonagem;

    public CDUcadastraPers(FormPersonagem formPersonagem, Connection cnxaobd)
    {
        this.formPersonagem = formPersonagem;
        this.formPersonagem.setCDU(this);
        conexaobd = cnxaobd;
    }

    public void exec()
    {
        formPersonagem.exibe();
    }
    public String getNomePersonagem(){
        return personagem.getNome();
    }

    public void SalvaPers()
    {
        String id = formPersonagem.getId();
        String nome = formPersonagem.getNome();

        personagem = new Personagem(id, nome);
        System.out.println("Salvando personagem");
        DAOPersonagem dao = new DAOPersonagem(conexaobd);
        int result = dao.adiciona(personagem);
        if (result == 0)
        {
            System.out.println("Persongem cadastrada com sucesso");
        }
        else 
            System.out.println("Problemas ao cadastrar a Personagem");
        
    }
}