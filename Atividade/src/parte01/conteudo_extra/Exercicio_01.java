/**
 Faça um programa para calcular a série de Fibonacci para um número informado
 pelo usuário, sendo F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2)  Por exemplo,
 caso o usuário informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13,
 21, 34
 */
package parte01.conteudo_extra;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        double fib[];
        boolean test;
        test=true;

        System.out.println("Digitar um numero inteiro positivo");
        num=teclado.nextInt();
        while(test == true) {
            if (num < 0) {
                System.out.println("Número digitado indevido");
                System.out.println("Digitar um numero inteiro");
                num = teclado.nextInt();
            } else {
                test = false;
            }
        }

        fib= new double[num+1];
        for(int i=0; i<num+1; i++){
            if(i==0){
                fib[i]=0;
                System.out.println(fib[i]);
            }
            else if (i ==1){
                fib[i]=1;

                System.out.println(fib[i]);
            }else{
                fib[i]=fib[i-1]+fib[i-2];

                System.out.println(fib[i]);
            }

        }

        //System.out.println("O resultado do Fibonacci é: "+fib);

        teclado.close();
    }
}
