package domain;

public class Performance {
    private Ator ator;
    private int idpersonagem;
    private Episodio episodio;

    public Performance(Ator ator, int idpersonagem, Episodio episodio) {
        this.ator = ator;
        this.idpersonagem = idpersonagem;
        this.episodio = episodio;
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
    public Episodio getepisodio() {
        return episodio;
    }
    public void setIdepisodio(Episodio episodio) {
        this.episodio = episodio;
    }

    


}