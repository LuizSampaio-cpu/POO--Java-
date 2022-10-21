public class Episodio {
    private int id;
    private String titulo;
    private String resumo;
    private int temporada;

    public Episodio (int id, String titulo, String resumo, int temporada)
    {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.temporada = temporada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    
}
