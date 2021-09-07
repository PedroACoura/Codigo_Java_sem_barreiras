/**
 * Escreva um algoritmo que leia números, insira em um array e após
 * mostre a quantidade de números negativos.
 */
package parte02.conteudo02;

import java.util.Scanner;

public class Execicio_02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeros, num[], somanega = 0;
        System.out.println("Quantos números você gostaria de digitar?");
        numeros = teclado.nextInt();
        num = new int[numeros];


        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um número de " + i + "/" + numeros);
            num[i] = teclado.nextInt();
            if (num[i] < 0) {
                somanega ++;
            }
        }
        System.out.println("A quantidade de número negativo é " + somanega);
    }
}
