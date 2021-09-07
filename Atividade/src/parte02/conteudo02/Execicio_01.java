/**
 * Escreva um algoritmo que leia números insira em um array e
 * após mostre os números informados na tela.
 */
package parte02.conteudo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Execicio_01 {


    public static void comArray() {
        try (Scanner teclado = new Scanner(System.in)) {

            int array[] = new int[0];
            int qts;
            System.out.println("Quantos números você gostaria de digitar?");
            qts = teclado.nextInt();
            if (qts > 0) {
                array = new int[qts];
            } else {
                System.out.println("Erro números digitado não é inteiro");
            }

            for (int i = 0; i < qts; i++) {
                System.out.println("Digite um número de " + i + "/" + qts);
                array[i] = teclado.nextInt();
            }
            System.out.println("Os números digitados são");
            for (int i = 0; i < qts; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static void comLista() {

        try (Scanner teclado = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;
            var numeros = new ArrayList<Integer>();
            while (programaDeveContinuarExecutando) {
                System.out.println("Digite um novo números");
                numeros.add(teclado.nextInt());

                System.out.println("Deseja adicionar mais um número [s] para sim, [n] para não");
                if (teclado.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;

                    System.out.println();
                }
            }
            System.out.println(numeros);

        }
    }


    public static void main(String[] args) {
        //comLista();
        comArray();
    }
}


