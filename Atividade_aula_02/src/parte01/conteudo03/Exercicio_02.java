package parte01.conteudo03;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num,nul;
        long fact=1L;

        System.out.println("Qual é o número que gostaria de saber o fatorial");
        num=teclado.nextInt();

        nul=num;
        if(num == 0) {
            fact=1;
        }else {
            do {
                fact=fact*num;
                num--;
            }while(num>0);
        }
        System.out.println("O fatorial de " + nul + " é " + fact);
        teclado.close();
    }
}
