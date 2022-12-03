package CDU;

import UI.*;
import domain.*;
import persistencia.DAOSerie;

import java.sql.Connection;

public class CDUcadastraSerie extends CDU {
    private Serie serie;
    private FormSerie formSerie;

    /* Associa este caso de uso ao seu respectivo formulário */
    public CDUcadastraSerie(FormSerie formSerie, Connection cnxaobd)
    {
        this.formSerie = formSerie;
        this.formSerie.setCDU(this);
        conexaobd = cnxaobd;
    }
     /*
     * Exibe a interface do usuário para este caso de uso.
     * A partir daqui este objeto cdu fica ativo e 'conversando' com
     * o respectivo formulário. Toda escolha de tarefa sinalizada no formulário
     * deve ser executada por este cdu.
     * 
     * O cdu deve oferecer métodos para CADA funcionalidade disponibilizada pelo
     * formulário ao usuário.
     */
    public void exec()
    {
        formSerie.exibe();
    }

    public void salvaSerie(){
        String id = formSerie.getId();
        String titulo = formSerie.getTitulo();
        int idade = Integer.valueOf(formSerie.getIdademin());

        serie = new Serie(id, titulo, idade, null, null);

        System.out.println("Salvando no banco de dados");
        DAOSerie dao = new DAOSerie(conexaobd);
        int result = dao.adiciona(serie);

        if (result == 0)
        {
            System.out.println("Serie cadastrada com sucesso");
        }
        else 
            System.out.println("Problemas ao cadastrar a série");
    }
    
}
