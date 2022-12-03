package persistencia;
import domain.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO: DATA ACCESS OBJECT.
 * Concetra os serviços de acesso às tabelas do baco para cada enteidade
 * de domínio do distema que possui uma respectiva tabela no banco de dados.
 * 
 * Cada classe de domínio possui um equivalente DAO para executar as ações 
 * padrões no banco de dados: cadastar (C), alterar (U), consultar (R), deletar (D).
 * Ver método abaixo.
 */


public class DAOEpisodio extends DAOPOOFlix {
    private Connection conexaobd;
    public DAOEpisodio(Connection cnx)
    {
        conexaobd= cnx;
    }
    public int adiciona(OBJPOOFlix objpooflix)
    {
        try {
            Episodio episodio = (Episodio) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into episodio(id, titulo, temporada, resumo) values (?, ?, ?, ?)");			
			ps.setInt(1, Integer.parseInt(episodio.getId()));
			ps.setString(2, episodio.getTitulo());
            ps.setString(2, episodio.getTemporada());
            ps.setString(2, episodio.getResumo());
			ps.execute();
			ps.close();		
			return 0;
        } catch (SQLException e) {
            System.out.println("Problemas em DAOEpisodio.adiciona" + e.getMessage());
			return -1;
        }
    }
    public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Episodio episodio = (Episodio) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update episodio set titulo=? where id=?");			
			ps.setInt(1, Integer.parseInt(episodio.getId()));
			ps.setString(2, episodio.getTitulo());
            ps.setString(2, episodio.getTemporada());
            ps.setString(2, episodio.getResumo());
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOEpisodio.atualiza" + e.getMessage());
			return -1;			
		}		
	}
	
	public int deleta(OBJPOOFlix objpooflix) {
		try {
			Episodio episodio = (Episodio) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from episodio where id=?");			
			ps.setInt(1, Integer.parseInt(episodio.getId()));
			ps.setString(2, episodio.getTitulo());
            ps.setString(2, episodio.getTemporada());
            ps.setString(2, episodio.getResumo());
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOEpisodio.deleta" + e.getMessage());
			return -1;			
		}		
	}

    public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> episodios = new ArrayList<OBJPOOFlix>();
			
			PreparedStatement ps = conexaobd.prepareStatement("select id, titulo, temporada, resumo from episodio");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String titulo = rs.getString("titulo");
                String temporada = rs.getString("temporada");
                String resumo = rs.getString("resumo");
				Episodio episodio = new Episodio(id,titulo,temporada, resumo);
				
				episodios.add(episodio);
			}
			
			rs.close();
			ps.close();
			
			return episodios;			
		} catch (SQLException e) {
			System.out.println("Problemas em DAOEpisodio.lista" + e.getMessage());
			return null;
		}
	}
}
