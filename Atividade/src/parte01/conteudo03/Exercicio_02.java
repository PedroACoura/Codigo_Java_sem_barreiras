package parte01.conteudo03;

/**
 Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
 */

// importação da bibliotecas
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // iniciando a função Scanner

        // declaração de variáveis
        int num,nul;
        long fact=1L;

        // solicita ao usuário para digitar o numero desejado
        System.out.println("Qual é o número que gostaria de saber o fatorial");
        num=teclado.nextInt();

        nul=num;
        // o fatorial de 0 é
        if(num == 0) {
            fact=1;
        }else {
            // cria um loop do calculo do fatorial
            do {
                fact=fact*num;
                num--;
            }while(num>0);
        }

        // imprime o resultado
        System.out.println("O fatorial de " + nul + " é " + fact);

        //encerra a função Scanner
        teclado.close();
    }
}

