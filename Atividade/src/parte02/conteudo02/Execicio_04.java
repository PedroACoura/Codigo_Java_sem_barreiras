/**
 Escreva um algoritmo que leia números,
 insira em um array e após mostre o maior valor.
*/
package parte02.conteudo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Execicio_04 {
    public static void comLista() {
        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuar =true;
            var numerosd= new ArrayList<Integer>();
            var numeros =0;
            var numeromax=Integer.MIN_VALUE;


            while(programaDeveContinuar){
                System.out.println("Digite um novo número");
                numeros=in.nextInt();
                numerosd.add(numeros);
                if(numeros > numeromax){
                   numeromax = numeros;
                }
                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuar = false;
                }
            }
            System.out.println("Os numeros digitado são "+numerosd);
            System.out.println("O maior valor digitado é "+numeromax);
        }

    }
    public static void main(String[] args) {

        comLista();

    }
}
