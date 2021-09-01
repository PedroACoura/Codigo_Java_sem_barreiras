package parte01.conteudo02;
/**


 Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:

 ->Infantil A = 5 a 7 anos
 ->Infantil B = 8 a 11 anos
 ->Juvenil A = 12 a 13 anos
 ->Juvenil B = 14 a 17 anos
 ->Adultos = Maiores de 18 anos


 */

import java.util.Scanner; // importando a biblioteca

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner telcado = new Scanner(System.in);  // inicia o scanner

        // solicita para o usurario digitar uma idade
        System.out.println("Por favor digite a idade");
        int idade = telcado.nextInt();

        if (idade >= 5 && idade <= 7) { // válida a catedoria Infantil A
            System.out.println("Infantil A ");
        } else if (idade >= 8 && idade <= 11) {// válida a catedoria Infantil b
            System.out.println("Infantil B ");
        } else if (idade >= 12 && idade <= 13) {// válida a catedoria Juvenil A
            System.out.println("Juvenil A ");
        } else if (idade >= 14 && idade <= 17) {// válida a catedoria Juvenil B
            System.out.println("Juvinel B");
        } else if (idade >= 18) {// válida a catedoria Adutos
            System.out.println("Adulto");
        } else {
            System.out.println("Pessoa menor de 5 anos");// informa que não contem catedoria pois é menor de 5 anos
        }

        telcado.close();  //encerra o scanner
    }
}
