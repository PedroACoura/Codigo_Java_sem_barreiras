package parte01.conteudo02;
/**
 Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo deverá perguntar qual é a escolha
 do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2. No final da execução
 o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
 */

// declaração de bibliotecas
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);// incia a função Scanner

        //  declaração de variáveis para o programa
        String j1,j2,pe="pedra",pa="papel",t="tesoura";
        int v1,v2;


        // mostra ao usuário os comando e o significado de cada uma das opções
        System.out.println("Escolha entre pe , pa, t sendo:");
        System.out.println("Pedra = pe");
        System.out.println("Papel =pa");
        System.out.println("Tesoura =t");

        // solicita ao primeiro usuário escolher
        System.out.println("Jogador 1 escolha uma das opções");
        j1=teclado.nextLine();

        // solicita ao segundo usuário escolher
        System.out.println("Jogador 2 escolha uma das opções");
        j2=teclado.nextLine();

        switch (j1){ // opções de caso do primeiro jogador
            case "pe":
                switch (j2){// opções de caso do primeiro jogador
                    case "pe":
                        System.out.println("Empate"); // mostra o resultado
                        break; // função usada para parar a leitura do case ou loop
                    case "pa":
                        System.out.println("O jogador 2 ganhou");
                        break;
                    case "t":
                        System.out.println("O jogador 1 ganhou");
                        break;
                }
                break;
            case "pa":
                switch (j2){
                    case "pe":
                        System.out.println("O jogador 1 ganhou");
                        break;
                    case "pa":
                        System.out.println("Empate");
                        break;
                    case "t":
                        System.out.println("O jogador 2 ganhou");
                        break;
                }
                break;
            case "t":
                switch (j2){
                    case "pe":
                        System.out.println("O jogador 2 ganhou");
                        break;
                    case "pa":
                        System.out.println("O jogador 1 ganhou");
                        break;
                    case "t":
                        System.out.println("Empate");
                        break;
                }
                break;
        }

        teclado.close(); // encerra a função Scanner
    }
}

