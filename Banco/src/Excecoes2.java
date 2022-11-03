
public class Excecoes2 {
    public static void main(String args[])
    {
        try{
            int a[]= new int[7];
            a[4] = 40/0;
            System.out.println("Primeiro comando do bloco try");

        }
        catch(ArithmeticException e)
        {
            System.out.println("Ocorreu uma Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ocorreu uma Array Index Out of Bounds Exception");
        }
        catch(Exception e){
            System.out.println("Ocorreu uma exception");
        }
        System.out.println("Fora do bloco try-catch");
    }
}
