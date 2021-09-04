package parte01.conteudo03;
/**


 Construa um algoritmo que leia 10 valores inteiros e positivos e:

 Encontre o maior valor
 Encontre o menor valor
 Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.


 */

// realiza a importação das bibliotecas
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // inicia a função Scanner

        // declara as varives
        int num, nummax, nummin, repet;
        //float med;
        double med;
        repet =5; // define o numero de repetição

        nummin=Integer.MAX_VALUE; // define o valor máximo do tipo inteiro e atribui a variável nummin
        nummax=Integer.MIN_VALUE;// define o valor mínimo  do tipo inteiro e atribui a variável nummax
        med=0;

        // inicia um loop de repetição ate chegar ao numero definido da variável repet
        for(int i=0 ; i<repet; i++){
            // solicita ao usuário pada digitar um número
            System.out.printf("Digite o número inteiro positivo %d/%d",(i+1),repet);
            System.out.println("");
            // System.out.println("Digite o número inteiro positivo "+(i+1)+"/10");
            num= teclado.nextInt();
            // verifica se o numero e inteiro e positivo
            if(num<0){
                System.out.println("O número não é inteiro positivo");
                i--;
            }else {
                // realiza a soma da media e o número digitado
                med = med + num;
                // verifica se o numero digitado e menor do que o valor contido na variavel nummin
                if (num < nummin) {
                    nummin = num;
                    // verifica se o numero digitado e maior do que o valor contido na variavel nummax
                } else if (num > nummax) {
                    nummax = num;
                }
            }
        }
        // realização do calculo da média.  Onde o 0.00 e para realizar as casa decimais
        med=(med/repet)+0.00;
        // mostra na tela os resultado
        System.out.println("O maior valor valor é "+nummax);
        System.out.println("O min valor valor é "+nummin);
        System.out.println("A média valor valor é "+med);

        teclado.close(); // encerra a função Scanner
    }
}


