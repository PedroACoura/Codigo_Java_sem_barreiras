package parte01.conteudo02;
/**
 * Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
 */

import java.util.Scanner; // biblioteca da Scanner

public class Exercicio_01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // inicia o scanner

        // declaração e ou atribuição de valores
        int num;

        // Solicitar que o usuário digite um noero
        System.out.println("Por favor digita uma número inteiro");
        num = teclado.nextInt();

        // se o numero dividido com 2 ter resto 0 é par se não é impar
        if ((num % 2) == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ínmpar");
        }

        teclado.close(); // encerra o scanner
    }
}
