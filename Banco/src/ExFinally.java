public class ExFinally {
    public static void main (String args[]){
        try {
            int num = 121/0;
            System.out.println(num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divisao por zero");
        }

        finally{
            System.out.println("Bloco finally rodando");
        }
        System.out.println("Fora do bloco catch");
    }
    
}
