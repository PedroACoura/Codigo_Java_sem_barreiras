package parte01.conteudo01;
/**
 Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
 Com calcular a área do retângulo é Area = base * altura.
 */

import java.util.Scanner; // importando a biblioteca necessaria pra a função Scanner


public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // iniciando a função Scanner

        // declarando as variaveis b e h
        double b; // foi declarado double por aceitar decinal  que utiliza o ponto no exemplo um e meio(1.5)e ter o
        // maior tamanho das variveis.
        double h;

        System.out.println("Por favor digite o tamanho da base do retângulo");// solicita ao usuario digitar o valor
        // da base
        b=teclado.nextDouble();

        System.out.println("Por favor digite o tamanho da altura do retângulo");// solicita ao usuario digitar o valor
        // da altura
        h=teclado.nextDouble();

        System.out.println("A áre do retângulo é "+(b*h)); //mostra a area e o calculo e realizado atraves do comando
        //+(b*h)


        teclado.close(); // finalizando a função Scanner
    }
}
