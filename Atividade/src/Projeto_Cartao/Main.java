package Projeto_Cartao;

import java.util.*;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Transacoes> transacoes;
    private static Map<Transacoes, Integer> extratos;
    private static ArrayList<Estabelecimento> estabelecimentos;
    private static ArrayList<Usuario> usuario;
    private static Map<Usuario, Integer> cartao;

    public static void main(String[] args) {
        transacoes = new ArrayList<Transacoes>();
        extratos = new HashMap<Transacoes, Integer>();
        cartao = new HashMap<Usuario, Integer>();
        //Teste.Main.menu();
        Main.tese();
        Main.cadastroEstabelecineto();
        Main.cadastroUsuário();
    }

    private static void cadastroEstabelecineto() {
        Estabelecimento estabelecimentos = new Estabelecimento("Shun", 1, "Rua 1", "Posto");
        System.out.println(estabelecimentos);

    }

    private static void cadastroUsuário() {
        Usuario usuario = new Usuario("Joao", "VA", "VA", "VA");
        System.out.println(estabelecimentos);

    }

    private static void tese() {
        Transacoes transacos = new Transacoes("João", "VA", 400.00, "Posto");
        Main.transacoes.add(transacos);
        System.out.println(transacos);


    }


}

 /*private static void menu(){
        System.out.println("=========================================");
        System.out.println("=============== Bem-vindo(a) ============");
        System.out.println("===============  NewGen      ============");
        System.out.println("=========================================");

        System.out.println("Selecione uma opção abaixo: ");
        System.out.println("1 - Vale Alimentação");
        System.out.println("2 - Vale Refeição");
        System.out.println("3 - Vale Combustivél");
        //System.out.println("4 - Visualizar carrinho");
        System.out.println("4 - Sair do sistema");
        System.out.println();

        int opcao = 0;
        try {
            opcao = Integer.parseInt(Teste.Main.teclado.nextLine());
        } catch (InputMismatchException e) {
            Teste.Main.menu();
        } catch (NumberFormatException f) {
            Teste.Main.menu();
        }
        switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Volte sempre!");
                    Utils.pausar(2);
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    Utils.pausar(2);
                    Mercado.menu();
                    break;
            }

        }
    }*/
/*
public class Teste.Main {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Transacoes> produtos;
    private static Map<Produto, Integer> carrinho;

    teclado.close();
}
*/