public class ExThrows {
    static void checaCondicao(int idade, int peso){
        if (idade < 12 && peso < 40)
        {
            throw new ArithmeticException("O aluno não está apto a se registrar");
        }
        else{
            System.out.println("A matricula é valida");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Bem vindo ao processo de matricula");
        checaCondicao(10,39);
        System.out.println("Tenha um otimo dia");
    }
    
}
