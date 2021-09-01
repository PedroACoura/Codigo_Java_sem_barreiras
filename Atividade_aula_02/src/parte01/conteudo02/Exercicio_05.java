package parte01.conteudo02;

import java.util.Scanner; // biblioteca Scanner

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in); // iniica a função Scanner

        // declaração de variveis
        double num1, num2;
        int  op;

        System.out.println("Digite 1 para adção, 2 subtração, 3 multiplicação, 4 divisão");
        op= teclado.nextInt();

        System.out.println("Digite o primeiro número inteiro e positivo");
        num1= teclado.nextInt();
        if (num1<0){
            System.out.println("O número não é inteiro positivo");
        }

        System.out.println("Digite o segundo número inteiro e positivo");
        num2= teclado.nextInt();
        if (num2<0){
            System.out.println("O número não é inteiro positivo");
        }

        switch (op){
            case 1:
                System.out.println("A soma de "+num1+ "+" +num2+ " é "+(num1+num2));
                break;
            case 2:
                System.out.println("A subtração de "+num1+ "-" +num2+ " é "+(num1-num2));
                break;
            case 3:
                System.out.println("A multiplicação de "+num1+ "*" +num2+ " é "+(num1*num2));
                break;
            case 4:
                System.out.println("A divisão de "+num1+ "/" +num2+ " é "+(num1/num2));
                break;
            default:
                System.out.println("Opção indisponivel");
        }

        teclado.close(); // iniica a função Scanner
    }
}
