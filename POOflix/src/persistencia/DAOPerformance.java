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

public class DAOPerformance extends DAOPOOFlix{
    private Connection conexaobd;
    public DAOPerformance(Connection cnx)
    {
        conexaobd = cnx;
    }
    public int adiciona(OBJPOOFlix objpooflix)
    {
        try {
            Performance perfo = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into performance(ator, idpersonagem, episodio) values (?, ?, ?)");			
			ps.setInt(1, Integer.parseInt(perfo.getIdpersonagem()));
			//ps.setString(2, perfo.getAtor());
			ps.execute();
			ps.close();		
			return 0;
        } catch (SQLException e) {
            System.out.println("Problemas em DAOPerformance.adiciona" + e.getMessage());
			return -1;
        }
    }
    public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Performance performance = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update performance set ator=? where id=?");			
			ps.setInt(1, Integer.parseInt(performance.getIdpersonagem()));
			//ps.setString(2, serie.getTitulo());
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOPerformance.atualiza" + e.getMessage());
			return -1;			
		}		
	}
	
	public int deleta(OBJPOOFlix objpooflix) {
		try {
			Performance performance = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from performance where id=?");			
			ps.setInt(1, Integer.parseInt(performance.getIdpersonagem()));
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOPerformance.deleta" + e.getMessage());
			return -1;			
		}		
	}

    public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> performances = new ArrayList<OBJPOOFlix>();
			
			PreparedStatement ps = conexaobd.prepareStatement("select id, ator, episodio from serie");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String ator = rs.getString("ator");
				//String episodio = rs.getString("episodio");
				Performance performance = new Performance(id,ator,0, null, null);
				
				performances.add(performance);
			}
			
			rs.close();
			ps.close();
			
			return performances;			
		} catch (SQLException e) {
			System.out.println("Problemas em DAOPerformance.lista" + e.getMessage());
			return null;
		}
	}
}
