package domain;

import java.util.HashMap;
import java.util.LinkedList;

public class Serie {
    private String id;
    private String titulo;
    private int clas_idade;
    private HashMap<String, Episodio> episodios;
    private LinkedList<Categoria> cat;
    public Serie (String id, String titulo, int clas_idade, HashMap<String, Episodio> episodios, LinkedList<Categoria> cat)
    {
        this.id = id;
        this.titulo = titulo;
        this.clas_idade = clas_idade;
        episodios = new HashMap<String, Episodio>();
        cat = new LinkedList<Categoria>();
    }
    public void addpeisodio(Episodio e)
    {
        episodios.put(e.getId(),e);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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


    public String[] getCat() {
        String[] array = new String[cat.size()];
        for (int i = 0; i < cat.size(); i++){
            array[i] =String.valueOf(cat.get(i));
        }
        return array;
    }

    public void setCat(Categoria categoria) {
        cat.add(categoria);
    }
    
    public String toString()
    {
        String s = "";
        s = "id: "+ id + ";\n";
        s = s + "Titulo: "+getTitulo()+";\n";
        s = s + "Classe etária: "+getClass()+";\n";
        return s;
    }



}
