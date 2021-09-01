package parte01.conteudo01;
/**
 Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

*/

import java.util.Scanner; // declara a biblioteca necessaria para rodar o Scanner

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in); // inicia a função Scanner

        // Declarações das variáves necessairo para o programa rodar
        int total_de_eleitor;
        int branco;
        int nulo;
        int valido;
        float porcentagembr,porcentagemnu,porcentagemva; // utiliza-se float para consegui casa décimais.
        int total_de_eleitor1;


        // Solicitando que o usuário informa  numero de eleitores, votos branco, votos nulo, voto válidos.
        System.out.println("Qual é o numero de eleitores?");
        total_de_eleitor = teclado.nextInt();

        System.out.println("Qual é o numero de  voto brancos ?");
        branco = teclado.nextInt();
        System.out.println("Qual é o numero de  voto nulo? ");
        nulo = teclado.nextInt();
        System.out.println("Qual é o numero de voto válido?");
         valido = teclado.nextInt();
        total_de_eleitor1 = branco+nulo+valido; // efetua a soma de todos os votos realizado

        // Calculando os valores o percentual de cada tipo de votos: branco, nulos,validos
        porcentagembr= (100f*branco)/total_de_eleitor;
        porcentagemnu= (100f*nulo)/total_de_eleitor;
        porcentagemva= (100f*valido)/total_de_eleitor;


        //Mostra na tela os resultados dos votos com o percentual
        System.out.println("O porcentual de voto branco é "+porcentagembr+"%");

        System.out.println("O porcentual de voto nulo é "+porcentagemnu+"%");

        //System.out.println("O porcentual de voto valido é "+porcentagemva+"%"); // forma usando o println
        System.out.printf("O porcentual de votos valido é: %.2f%%%n ", porcentagemva,"%"); // forma usando o printf

    }
}
