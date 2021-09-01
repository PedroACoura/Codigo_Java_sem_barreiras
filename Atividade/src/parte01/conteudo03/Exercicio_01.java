package parte01.conteudo03;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, nummax, nummin, repet;
        //float med;
        double med;
        repet =5;

        nummin=Integer.MAX_VALUE;
        nummax=Integer.MIN_VALUE;
        med=0;

        for(int i=0 ; i<repet; i++){
            System.out.printf("Digite o número inteiro positivo %d/%d",(i+1),repet);
            System.out.println("");
           // System.out.println("Digite o número inteiro positivo "+(i+1)+"/10");
            num= teclado.nextInt();
            if(num<0){
                System.out.println("O número não é inteiro positivo");
               i--;
            }else {
                med = med + num;
                if (num < nummin) {
                    nummin = num;
                } else if (num > nummax) {
                    nummax = num;
                }
            }
        }
        med=(med/repet)+0.00;

        System.out.println("O maior valor valor é "+nummax);
        System.out.println("O min valor valor é "+nummin);
        System.out.println("A média valor valor é "+med);

        teclado.close();
    }
}

