package persistencia;

import java.sql.*;

/*
 * Representa um banco de dados da aplicação.
 * Como o banco pode ter qualquer nome então os dados da conexão então o fornecimento dos
 * dados da aplicação é adiado para quando o controlador da aplicação CDUMain iniciar a
 * execução do sistema, CDUMain.exec().
 */

 public class BDFlix {
    private String url;
    private String usuario;
    private String senha;
    Connection conexao = null;

    public BDFlix(String url, String usuario, String senha) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection conecta()
    {
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e){
            System.err.println("Erro em BDFlix.conecta: "+ e.getMessage());
        }
        return conexao;
    }
    public Connection getconexao()
    {
        return conexao;
    }
    public void desconecta()
    {
        try {
            conexao.close();
        } catch (NullPointerException e) {
            System.err.println("ERRO em BDFlix.desconecta: "+ e.getMessage());
        }
        catch (SQLException e){
            System.err.println("Erro em BDFlix.desconecta: "+ e.getMessage());
        }
    }

 }
