package CDU;

import domain.*;
import UI.*;

public class CDUcadastraEp extends CDU{
    private Episodio episodio = null;
    private FormEpisodio formEpisodio;

    public CDUcadastraEp (FormEpisodio formEpisodio) {
        this.formEpisodio = formEpisodio;
        this.formEpisodio.setCDU(this);
    }
    public void exec()
    {
        formEpisodio.exibe();
    }

    public String getNomeSerie(int idserie)
    {
        //Serie serie = bd.getSerie(idserie);
        //return serie.gettitulo();
        return "Black Mirror";
    }
    public void salvarEpisodio() {
        String id = formEpisodio.getId();
        String idserie = formEpisodio.getIdserie();
        String temporada = formEpisodio.getTemporada();
        String titulo = formEpisodio.getTitulo();
        String resumo = formEpisodio.getResumo();

        episodio = new Episodio(id,titulo,temporada,resumo);   

        //bd.salvarEpisodio(episodio);
        System.out.println("Salvando no banco de dados.." + episodio);
    }


}