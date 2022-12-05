package CDU;

import domain.*;
import UI.*;
import java.sql.Connection;

public class CDUcadastraEp extends CDU{
    private Episodio episodio = null;
    private FormEpisodio formEpisodio;

    /*Associa este caso de uso ao seu respectivo formulário */
    public CDUcadastraEp (FormEpisodio formEpisodio, Connection cnxaobd) {
        this.formEpisodio = formEpisodio;
        this.formEpisodio.setCDU(this);
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
       // String idserie = formEpisodio.getIdserie();
        String temporada = formEpisodio.getTemporada();
        String titulo = formEpisodio.getTitulo();
        String resumo = formEpisodio.getResumo();

        episodio = new Episodio(id,titulo,temporada,resumo);   

        //bd.salvarEpisodio(episodio);
        System.out.println("Salvando no banco de dados.." + episodio);
    }


}