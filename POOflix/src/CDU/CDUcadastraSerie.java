package CDU;

import UI.*;
import domain.*;

public class CDUcadastraSerie extends CDU {
    private Serie serie;
    private FormSerie formSerie;

    public CDUcadastraSerie(FormSerie formSerie)
    {
        this.formSerie = formSerie;
        this.formSerie.setCDU(this);
    }
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
    }
    
}
