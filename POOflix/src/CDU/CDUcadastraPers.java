package CDU;

import domain.*;
import UI.*;

public class CDUcadastraPers extends CDU{
    private Personagem personagem = null;
    private FormPersonagem formPersonagem;

    public CDUcadastraPers(FormPersonagem formPersonagem)
    {
        this.formPersonagem = formPersonagem;
        this.formPersonagem.setCDU(this);
    }

    public void exec()
    {
        formPersonagem.exibe();
    }
    public String getNomePersonagem(){
        return "Bruce Wayne";
    }

    public void SalvaPers()
    {
        
    }
}