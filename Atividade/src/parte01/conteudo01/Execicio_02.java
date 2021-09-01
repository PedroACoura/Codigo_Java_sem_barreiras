package parte01.conteudo01;
/**
 Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

 Vamos aprender a recuperar valores nos nossos programas Java?

 import java.util.Scanner;
 class Main
 {
 public static void main(String args[])
 {
 Scanner in = new Scanner(System.in);
 String s = in.nextLine();
 System.out.println("Você inseriu uma string de valor  "+s);
 int a = in.nextInt();
 System.out.println("Você inseriu um integer de valor  "+a);
 float b = in.nextFloat();
 System.out.println("Você inseriu um float de valor "+b);
 }
 }
 */
//Precisa de importa a biblioteca Scanner para utilizar a função Scanner
import java.util.Scanner;

public class Execicio_02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // iniciando a função Scanner e pedeindo para ela guadar a entrada

        System.out.println("Por favor digite um texto de s"); // Mensagem para o usuario digitar no teclado
        String s = teclado.nextLine();// atribuindo o texto digitado a variavel s;
        System.out.println("Você inseriu uma string de valor: " +( s)); //mostrando a mensgam no terminal para o usuario
        System.out.println("");

        System.out.println("Por favor digite o nuemro inteiro  de a");
        int a = teclado.nextInt();
        System.out.println("O antecessor  do numero digitado é: " +( a-1));
        System.out.println("");

        System.out.println("Por favor digite o nuemro float  de b");
        float b = teclado.nextFloat();
        System.out.println("O antecessor  do numero digitado é:  " +( b-1));

        teclado.close(); // terminando a função Scanner

    }
}
