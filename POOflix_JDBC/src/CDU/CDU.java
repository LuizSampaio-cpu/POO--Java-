package CDU;

import java.sql.*;

/*
 * Todo controlador de caso de uso do sistema precisa acessar o banco de dados do sistema
 * e executar as ações do caso de uso selecionado pelo usuário.
 */

public abstract class CDU {
    protected Connection conexaobd;
    public abstract void exec();
}
