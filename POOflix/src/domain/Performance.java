package domain;

public class Performance {
    private Ator ator;
    private int idpersonagem;
    private int idepisodio;

    public Performance(Ator ator, int idpersonagem, int idepisodio) {
        this.ator = ator;
        this.idpersonagem = idpersonagem;
        this.idepisodio = idepisodio;
    }
    public Ator getAtor() {
        return ator;
    }
    public void setAtor(Ator ator) {
        this.ator = ator;
    }
    public int getIdpersonagem() {
        return idpersonagem;
    }
    public void setIdpersonagem(int idpersonagem) {
        this.idpersonagem = idpersonagem;
    }
    public int getIdepisodio() {
        return idepisodio;
    }
    public void setIdepisodio(int idepisodio) {
        this.idepisodio = idepisodio;
    }

    


}