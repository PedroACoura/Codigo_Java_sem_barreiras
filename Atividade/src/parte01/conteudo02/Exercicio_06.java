package parte01.conteudo02;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String j1,j2,pe="pedra",pa="papel",t="tesoura";
        int v1,v2;



        System.out.println("Escolha entre pe , pa, t sendo:");
        System.out.println("Pedra = pe");
        System.out.println("Papel =pa");
        System.out.println("Tesoura =t");

        System.out.println("Jogador 1 escolha uma das opções");
        j1=teclado.nextLine();

        System.out.println("Jogador 2 escolha uma das opções");
        j2=teclado.nextLine();

        switch (j1){
            case "pe":
                switch (j2){
                    case "pe":
                        System.out.println("Empate");
                    break;
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

        teclado.close();
    }
}
