package parte01.conteudo02;
/**
 Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração,
 multiplicação e divisão). Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário
 qual operação ele deseja fazer e quais são os valores.
*/

import java.util.Scanner; // biblioteca Scanner

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in); // iniica a função Scanner

        // declaração de variveis
        double num1, num2;
        int  op;

        // pergunta ao usuário qual é a conta que gostaria de realizar.
        System.out.println("Digite 1 para adção, 2 subtração, 3 multiplicação, 4 divisão");
        op= teclado.nextInt();
        // solicita ao usuário para digitar o primeiro número
        System.out.println("Digite o primeiro número inteiro e positivo");
        num1= teclado.nextInt();
        // verifica se o numero e maior do que 0
        if (num1<0){
            System.out.println("O número não é inteiro positivo");
        }

        // solicita ao usuario para ditar o sengundo número
        System.out.println("Digite o segundo número inteiro e positivo");
        num2= teclado.nextInt();
        // verifica se o numero e maior do que 0
        if (num2<0){
            System.out.println("O número não é inteiro positivo");
        }

        switch (op){
            case 1: // adição
                System.out.println("A soma de "+num1+ "+" +num2+ " é "+(num1+num2));
                break;
            case 2: // subtração
                System.out.println("A subtração de "+num1+ "-" +num2+ " é "+(num1-num2));
                break;
            case 3: // multiplicação
                System.out.println("A multiplicação de "+num1+ "*" +num2+ " é "+(num1*num2));
                break;
            case 4: // divisão
                System.out.println("A divisão de "+num1+ "/" +num2+ " é "+(num1/num2));
                break;
            default:// erro na escolha
                System.out.println("Opção indisponivel");
        }

        teclado.close(); // iniica a função Scanner
    }
}
