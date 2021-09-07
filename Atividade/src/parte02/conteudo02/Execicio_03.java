/**
 Escreva um algoritmo que leia números, insira em um array e
 após mostre a quantidade de números pares.
*/
package parte02.conteudo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Execicio_03 {
    public static void comLista() {
        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuar =true;
            var numerospares= new ArrayList<Integer>();
            var numeros =0;

            while(programaDeveContinuar){
                System.out.println("Digite um novo número");
                numeros=in.nextInt();
                if(numeros %2 == 0){
                    numerospares.add(numeros);
                }
                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuar = false;
                }
            }

            System.out.println(numerospares);
        }

    }
    public static void main(String[] args) {

        comLista();

    }
}
