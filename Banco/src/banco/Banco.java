package banco;

public class Banco {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "luiz";
        p1.cpf = "123.456.789-00";
        p1.idade = 19;
        p1.sexo = 'M';

        Pessoa p2 = new Pessoa();
        p2.nome = "Joao";
        p2.cpf = "122.455.788-00";
        p2.idade = 11;
        p2.sexo = 'M';


        Conta c1 = new Conta();
        c1.titular = p1;
        c1.numero = "11";
        c1.limite = 200.00;
        c1.saldo = 100.00;

        System.out.println("O dono da conta " + c1.numero + " e " + c1.titular);
    }
}

