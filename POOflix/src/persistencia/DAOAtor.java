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


public class DAOAtor extends DAOPOOFlix {
    private Connection conexaobd;
    public DAOAtor(Connection cnx)
    {
        conexaobd = cnx;
    }
    public int adiciona(OBJPOOFlix objpooflix)
    {
        try {
            Ator ator = (Ator) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into ator(id, nome, nacionalidade) values (?, ?, ?)");			
			ps.setInt(1, Integer.parseInt(ator.getId()));
			ps.setString(2, ator.getNome());
            ps.setString(2, ator.getNacionalidade());
			ps.execute();
			ps.close();		
			return 0;
        } catch (SQLException e) {
            System.out.println("Problemas em DAOAtor.adiciona" + e.getMessage());
			return -1;
        }
    }
    public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Ator ator = (Ator) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update ator set nome=? where id=?");			
			ps.setInt(1, Integer.parseInt(ator.getId()));
			ps.setString(2, ator.getNome());
            ps = conexaobd.prepareStatement("update ator set nacionalidade=? where id=?");			
			ps.setInt(1, Integer.parseInt(ator.getId()));
			ps.setString(2, ator.getNacionalidade());
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOAtor.atualiza" + e.getMessage());
			return -1;			
		}		
	}
	
	public int deleta(OBJPOOFlix objpooflix) {
		try {
			Ator ator = (Ator) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from ator where id=?");			
			ps.setInt(1, Integer.parseInt(ator.getId()));
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOAtor.deleta" + e.getMessage());
			return -1;			
		}		
	}

    public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> atores = new ArrayList<OBJPOOFlix>();
			
			PreparedStatement ps = conexaobd.prepareStatement("select id, nome, nacionalidade from ator");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String nome = rs.getString("nome");
                String nacionalidade = rs.getString("nacionalidade");
				Ator ator = new Ator(id, nome, nacionalidade, null);
				
				atores.add(ator);
			}
			
			rs.close();
			ps.close();
			
			return atores;			
		} catch (SQLException e) {
			System.out.println("Problemas em DAOAtor.lista" + e.getMessage());
			return null;
		}
	}
    
}
