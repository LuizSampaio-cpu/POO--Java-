package CDU;

import UI.*;

/*
 * Aplicação propriamente dita: o primeiro código a ser executado dentro do sistema POOFlix.
 */

public class POOflix {
    public static void main(String[] args)
    {
        /* Dentro do modelo em camadas, e do framework POOFlix, cria o contrlador de caso de uso
    	 * do menu principal, o seu respectivo formulário e faz a associação entre os dois.
    	 */
        FormMain telaMain = new FormMain();
        CDUMain casoUsoMain = new CDUMain(telaMain);

        casoUsoMain.exec();// inicia a execução do sistema
    }
}