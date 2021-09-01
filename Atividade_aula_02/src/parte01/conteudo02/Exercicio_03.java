package parte01.conteudo02;
/**
 Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que
 determina o maior também.
*/

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);// inicia o scanner

        int num1, num2; // declaração das varives

        // pede ao usuário digita  um numero de cada vez e guarda o numero digitado pelo usario dentro de uma variavel
        System.out.println("Por favor digite um numero inteiro ");
        num1=teclado.nextInt();

        System.out.println("Por favor digite um numero inteiro ");
        num2=teclado.nextInt();

        if(num1>num2){ // verifica se o primeiro número é maior do que o segundo mostra ao usuario
            System.out.println("O número "+num1+" é maior que "+num2);
        }else if (num1<num2){// verifica se o primeiro número é menor do que o segundo
            System.out.println("O número "+num2+" é maior que "+num1);
        }else{// verifica se o primeiro número é igual ao segundo
            System.out.println("O número "+num2+" é igual ao número "+num1);
        }
        teclado.close();// encerra o scanner
    }
}
