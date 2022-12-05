package domain;

public class Performance implements OBJPOOFlix{
    private Ator ator;
    private String idpersonagem;
    private Episodio episodio;

    public Performance(Ator ator, String idpersonagem, Episodio episodio) {
        this.ator = ator;
        this.idpersonagem = idpersonagem;
        this.episodio = episodio;
    }
    public Performance(String id, String titulo, int i, Object object, Object object2) {
    }
    public Ator getAtor() {
        return ator;
    }
    public void setAtor(Ator ator) {
        this.ator = ator;
    }
    public String getIdpersonagem() {
        return idpersonagem;
    }
    public void setIdpersonagem(String idpersonagem) {
        this.idpersonagem = idpersonagem;
    }
    public Episodio getepisodio() {
        return episodio;
    }
    public void setIdepisodio(Episodio episodio) {
        this.episodio = episodio;
    }

    


}