package UI;

import java.io.Console;

import CDU;


public class FormMain {
    private CDUMain cduMain = NULL;

    public void setCDU(CDUMain cduMain)
    {
        this.cduMain = cduMain;
        this.FormMain.setCDU(this);
    }




    public void exibe()
    {
        String continuar;
        Console c = System.console();
        boolean termina = false;


        System.out.println("POOFlix\n");

        while (!termina)
        {

        }
        
    }
}