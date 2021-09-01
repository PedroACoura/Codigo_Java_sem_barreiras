/**
 * Faça um programa para listar todos os divisores de um número ou dizer que o número
 * é primo caso não existam divisores . Ao final, verifique se o usuário deseja
 * analisar outro número
 */
package parte01.conteudo_extra;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int pri;
        int div;
        int memo;
        String repete="sim";
        boolean test;
        test = true;

        System.out.println("Digitar um numero inteiro positivo");
        num = teclado.nextInt();

        while (repete == "sim"){
            while (test == true) {
                if (num < 0) {
                    System.out.println("Número digitado indevido");
                    System.out.println("Digitar um numero inteiro");
                    num = teclado.nextInt();
                } else {
                    test = false;
                }
            }
        memo = num;

        if (memo == 0 || num == 1) {
            System.out.println("Não são considerados números primos ");
        } else {
            div = memo / 1;
            pri = memo / memo;

            for (int i = 2; i < num; i++) {

                if (div == 0 && memo == 0) {
                    System.out.println("São números primos");
                } else if (memo % i == 0) {
                    System.out.println("O número " + i + " é divisor de " + memo);
                }
            }
        }
        System.out.println("Se quiser repetir digite sim");
        repete = teclado.next();
    }




        teclado.close();
    }

}
