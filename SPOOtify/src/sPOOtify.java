package src;

import java.util.Scanner;

public class sPOOtify {
    public static void main(String[] args) {
        Playlist list = new Playlist("Rock");
        Musica mus;
        Podcast pod;
        Audiolivro livro;
        
        
        Scanner entrada = new Scanner(System.in);

        System .out.println("Digite o que adicionar a playlist <musica, podcast ou livro>");

        String resposta = entrada.nextLine();

        if(resposta == "musica")
        {
            System.out.println("Nome da Musica:");
            String nome = entrada.nextLine();
            System.out.println("Genero Musical:");
            String genero = entrada.nextLine();
            System.out.println("Duração em Segundos da musica");
            int duracao = entrada.nextInt();

            mus = new Musica(nome, duracao, genero);

            System.out.println("Quantos Compositores: ");
            int quant = entrada.nextInt();

            for(int i = 0; i < quant; i++)
            {
                System.out.println("Nome do compositor: ");
                mus.novoCompositor(entrada.nextLine());
            }
            System.out.println("Quantos Interpretes: ");
            int quantInt = entrada.nextInt();

            for(int i = 0; i < quantInt; i++)
            {
                System.out.println("Nome do interprete: ");
                mus.novoCompositor(entrada.nextLine());
            }
            list.novaMusica(mus);
        }
        if(resposta == "livro")
        {
            System.out.println("Nome do Livro:");
                String titulo = entrada.nextLine();
                System.out.println("Nome da Editora:");
                String editora = entrada.nextLine();
                System.out.println("Duracao em segundos: ");
                int duracao = entrada.nextInt();
                System.out.println("Nome do Narrador:");
                String nomeAp = entrada.nextLine();
                System.out.println("Resumo:");
                String resumo = entrada.nextLine();
                System.out.println("Quantidade de autores:");
                int aut = entrada.nextInt();

                livro = new Audiolivro(titulo, duracao, editora, nomeAp, resumo);
                for(int i=0; i < aut; i++)
                {
                    System.out.println("Autor: ");
                    livro.novoAutor(entrada.nextLine());
                }
                list.novoLivro(livro);
        }
        if(resposta == "podcast")
        {
            System.out.println("Nome do podcast:");
                String nome = entrada.nextLine();
                System.out.println("Nome do host:");
                String host = entrada.nextLine();
                System.out.println("Duracao em segundos: ");
                int duracao = entrada.nextInt();
                System.out.println("Tema:");
                String tema = entrada.nextLine();
                System.out.println("Resenha:");
                String resenha = entrada.nextLine();

                pod= new Podcast(nome, duracao, host, tema, resenha);
                list.novoPodcast(pod);
                
        }

        entrada.close();
    }
}
