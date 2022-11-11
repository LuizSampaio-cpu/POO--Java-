package CDU;
import javax.print.DocFlavor.STRING;

import UI.*;
import domain.*;

public class CDUcadastraPerformance extends CDU {
    private Performance performance;
    private FormPerformance formPerformance;

    public CDUcadastraPerformance(FormPerformance formPerformance){
        this.formPerformance = formPerformance;
        this.formPerformance.setCDU(this);
    }

    public void exec()
    {
        formPerformance.exibe();
    }

    public String getNomePerf()
    {
        return "Performance x";
    }

    public void salvaPerf(){
        Ator ator = formPerformance.getAtor();
        String idPersonagem = formPerformance.getIdPersonagem();
        Episodio episodio = formPerformance.getEpisodio();
        performance = new Performance(ator, 0, episodio);
        System.out.println("Salvando no banco de dados");
    }
    
}
