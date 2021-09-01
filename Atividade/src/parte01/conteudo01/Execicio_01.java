package parte01.conteudo01;

/**
 Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
 A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com
 que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram
 armazenados nas variáveis.
*/
public class Execicio_01 {
    public static void main(String[] args) {
        int y =99; // declarando e definindo o valor da variável y
        int z =11;// declarando e definindo o valor da variável y
        int a=z;// declarando e copiando o valor da variável z

        System.out.println("O valor da letra y contem é: "+y); // Mostrando o valor original da variavel y
        System.out.println("O valor da letra z contem é: "+z);// Mostrando o valor original da variavel z

        //Método que realiza a inversão do valor da variavel y e z.
        z=y;// copiando o valor da variável y para a variável z
        y=a;// copiando o valor da variável a para a variável y
        System.out.println("O valor da letra y contem é: "+y); // Mostrando o valor original da variavel y
        System.out.println("O valor da letra z contem é: "+z);// Mostrando o valor original da variavel z

    }
}
