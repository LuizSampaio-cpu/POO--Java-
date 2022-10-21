


public class Serie {
    private int id;
    private String titulo;
    private int clas_idade;

    public Serie (int id, String titulo, int clas_idade)
    {
        this.id = id;
        this.titulo = titulo;
        this.clas_idade = clas_idade;
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

    public int getClas_idade() {
        return clas_idade;
    }

    public void setClas_idade(int clas_idade) {
        this.clas_idade = clas_idade;
    }



}
