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

public class DAOPersonagem extends DAOPOOFlix {
    private Connection conexaobd;
    public DAOPersonagem(Connection cnx)
    {
        conexaobd = cnx;
    }
    public int adiciona(OBJPOOFlix objpooflix)
    {
        try {
            Personagem personagem = (Personagem) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into personagem(id, nome) values (?, ?)");			
			ps.setInt(1, Integer.parseInt(personagem.getId()));
			ps.setString(2, personagem.getNome());
			ps.execute();
			ps.close();		
			return 0;
        } catch (SQLException e) {
            System.out.println("Problemas em DAOPersonagem.adiciona" + e.getMessage());
			return -1;
        }
    }
    public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Personagem personagem = (Personagem) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update Personagem set nome=? where id=?");			
			ps.setInt(1, Integer.parseInt(personagem.getId()));
			ps.setString(2, personagem.getNome());
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOPersonagem.atualiza" + e.getMessage());
			return -1;			
		}		
	}
    public int deleta(OBJPOOFlix objpooflix) {
		try {
			Personagem personagem = (Personagem) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from personagem where id=?");			
			ps.setInt(1, Integer.parseInt(personagem.getId()));
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOPersonagem.deleta" + e.getMessage());
			return -1;			
		}		
	}
    public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> personagens = new ArrayList<OBJPOOFlix>();
			
			PreparedStatement ps = conexaobd.prepareStatement("select id, nome from personagem");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String nome = rs.getString("Nome");
				Personagem personagem = new Personagem(id, nome);
				
				personagens.add(personagem);
			}
			
			rs.close();
			ps.close();
			
			return personagens;			
		} catch (SQLException e) {
			System.out.println("Problemas em DAOPersonagem.lista" + e.getMessage());
			return null;
		}
	}
}
