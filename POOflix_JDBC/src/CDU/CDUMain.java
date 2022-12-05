package CDU;

import UI.*;
import java.sql.*;
import persistencia.BDFlix;


public class CDUMain extends CDU{
    private FormMain FormMain;
    private String url = "jdbc:postgresql://motty.db.elephantsql.com/lkeyduhv";
    private String usuario = "lkeyduhv";
    private String senha = "OsnCOsRLeiOIfh_TTx4VfK8ODyq_9DI-";
    private BDFlix bd = null;
    private Connection conexao = null;

    public CDUMain(FormMain FormMain)
    {
        this.FormMain = FormMain;
        this.FormMain.setCDU(this);
     
            
    }
    /*
     * Estabelece a conexão com o banco de dados e, se tiver sucesso, exibe o
     * menu principal ativando o formMain.exibe().
     * 
     * Caso não haja sucesso no estabelecimento da conexão com o banco, a execução
     * do sistema é abortada.
     */

    public void exec()
    {
        bd = new BDFlix(url, usuario, senha);
    	
    	System.out.println("Conectando ao banco de dados POOFlix..");
    	Connection conexao = bd.conecta();
        if(conexao != null) {
    		System.out.println("Conexão estabelecida com sucesso!\n");
    		FormMain.exibe(); // <== exibe o menu principal. 
    		/*
    		 * Enquanto o menu principal estiver em execução o sistema POOFlix é
    		 * considerado em execução. 
    		 * Quando exibe() termina, os comandos abaixo encerram as conexões e 
    		 * o controle retorna ao método main da classe POOFlix.
    		 */
    		
    		System.out.println("\nAguarde, fechando conexão com o banco de dados ..");
    		bd.desconecta();
    		System.out.println("conexão encerrada com sucesso.\n");
    	}
    	else {
    		System.out.println("Problemas ao estabelecer a conexão com o banco de dados!");
    		System.out.println("Encerrando do sistema!!\n");
    	}
    }
    public BDFlix getbd()
    {
        return bd;
    }
    
    public Connection getConexao()
    {
        return conexao;
    }
    /*
     * Processa a opção selecionada pelo usuário no menu principal.
     */
    public void processaOpcao(String opcao)
    {
        switch(opcao)
        {
            case "1": execCadSerie();break;
            case "2": execCadEpisodio();break;
        }
    }
    public void execCadSerie(){
        FormSerie telaSerie = new FormSerie();
        CDUcadastraSerie casoUsoSerie = new CDUcadastraSerie(telaSerie, bd.getconexao());
        casoUsoSerie.exec();
    }

    public void execCadEpisodio(){
        FormEpisodio telaEpisodio = new FormEpisodio();
        CDUcadastraEp casoUsoEpis = new CDUcadastraEp(telaEpisodio,bd.getconexao());
        casoUsoEpis.exec();        
    }

}