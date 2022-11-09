package CDU;

import UI.*;

public class POOflix {
    public static void main(String[] args)
    {
        FormMain telaMain = new FormMain();
        CDUMain casoUsoMain = new CDUMain(telaMain);

        casoUsoMain.exec();
    }
}