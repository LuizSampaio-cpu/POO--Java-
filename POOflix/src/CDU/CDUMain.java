package CDU;

import UI.*;
//import domain.*;

public class CDUMain extends CDU{
    private FormMain FormMain;

    public CDUMain(FormMain FormMain)
    {
        this.FormMain = FormMain;
        this.FormMain.setCDU(this);
     
            
    }
    public void exec()
    {
        FormMain.exibe();
    }

    public void processaOpcao(String opcao)
    {
        switch(opcao)
        {
            case "1": execCadSerie();break;
            case "2": execCadEpisodio();break;
        }
    }
    public void execCadSerie(){
        FormSerie telaSerie = new FormSerie();
        CDUcadastraSerie casoUsoSerie = new CDUcadastraSerie(telaSerie);
        casoUsoSerie.exec();
    }

    public void execCadEpisodio(){
        FormEpisodio telaEpisodio = new FormEpisodio();
        CDUcadastraEp casoUsoEpis = new CDUcadastraEp(telaEpisodio);
        casoUsoEpis.exec();        
    }

}