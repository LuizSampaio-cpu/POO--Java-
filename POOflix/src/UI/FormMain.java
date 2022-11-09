package UI;

import java.io.Console;

import CDU;


public class FormMain extends Form{
    private CDUMain cduMain = null;

    public void setCDU(CDUMain cduMain)
    {
        this.cduMain = cduMain;
        this.FormMain.setCDU(this);
    }




    public void exibe()
    {
        String opcao;
        Console c = System.console();
        boolean termina = false;


        System.out.println("POOFlix\n");

        while (!termina)
        {
            System.out.println("1. Cadastrar Série\n");
            System.out.println("2. Cadastrar Episódio\n");
            System.out.println("3. Sair\n");

            opcao = c.readLine("Digite a opcao desejada");
            termina = opcao.equals("3");

            if(!termina)
                cdumain.processaOpcao(opcao);
            
        }
        
    }
}