package CDU;

import java.sql.Connection;
import UI.*;
import domain.*;
import persistencia.DAOPerformance;

public class CDUcadastraPerformance extends CDU {
    private Performance performance;
    private FormPerformance formPerformance;

    public CDUcadastraPerformance(FormPerformance formPerformance, Connection cnxaobd){
        this.formPerformance = formPerformance;
        this.formPerformance.setCDU(this);
        conexaobd = cnxaobd;
    }

    public void exec()
    {
        formPerformance.exibe();
    }

    public String getNomePerf()
    {
        return performance.getIdpersonagem();
    }
    public void salvaPerf(){
        Ator ator = formPerformance.getAtor();
        String idPersonagem = formPerformance.getIdPersonagem();
        Episodio episodio = formPerformance.getEpisodio();
        performance = new Performance(ator, idPersonagem, episodio);
        System.out.println("Salvando no banco de dados");
        DAOPerformance dao = new DAOPerformance(conexaobd);
        int result = dao.adiciona(performance);
        if (result == 0)
        {
            System.out.println("Performance cadastrada com sucesso");
        }
        else 
            System.out.println("Problemas ao cadastrar a Performance");
    }
}
    

