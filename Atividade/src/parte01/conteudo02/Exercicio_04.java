package parte01.conteudo02;
/**


 Construa um algoritmo que leia 10 valores inteiros e positivos e:

 Encontre o maior valor
 Encontre o menor valor
 Calcule a média dos números lidos


 */

import java.util.Scanner; // exporta a biblioteca

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);// inicia o scanner

        //declaração de varáveis
        int num, nummax, nummin;
        double  med;

        // inicia uma rotina d repetição de codigo ate realizar as des vezes
        System.out.println("Digite um número 1/10"); // solicita ao usuário para digitar um numero
        num = teclado.nextInt(); // guarda o numero digitado pelo usuário
        //nummax =Integer.MIN_VALUE; // define o valor mim da variavel inteiro para o variável max
        //nummin= Integer.MAX_VALUE // define o valor max da variavel inteiro para o variável mim
        nummin = num; // copia o valor digitado
        nummax = num;// copia o valor digitado
        med=num;// copia o valor digitado


        System.out.println("Digite um número 2/10");
        num = teclado.nextInt();
        med=num+med; // soma o novo numero para na variavel med
        if (num < nummin) { // verifica se o numero é menor do que o minimo
            nummin = num; // se for subitiur o valor do numero minimo
        }
        if (num > nummax) {// verifica se o numero é maior do que o máximo
            nummax = num;// se for subitiur o valor do numero máximo
        }

        System.out.println("Digite um número 3/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 4/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 5/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 6/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 7/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 8/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 9/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }

        System.out.println("Digite um número 10/10");
        num = teclado.nextInt();
        med=num+med;
        if (num < nummin) {
            nummin = num;
        }
        if (num > nummax) {
            nummax = num;
        }


        System.out.println("O numero maior é " + nummax); // mostra ao usuario o maior numero
        System.out.println("O numero menor é " +  nummin);// mostra ao usuario o menor numero
        System.out.println("A media dos numeros é " +(med/10.0)); // mostra a média total dos numeros digitados

        teclado.close();// encerra o scanner

    }
}
