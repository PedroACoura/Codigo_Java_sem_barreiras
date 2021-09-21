package Versao3;

import java.util.Locale;
import java.util.Scanner;


public class LayoutDoPrograma {

    boolean programaInicial = true;
    boolean executarOMenuInicial = true;
    boolean programaParaUsuarios;
    boolean abastecimentoDeCartao;
    Administrador administrador = new Administrador();
    Estabelecimentos estabelecimentos = new Estabelecimentos();
    int valeSelecionadoPeloUsuario;
    int tipoDeTransacao;
    Integer opcaoDeExtrato;
    String cpf,datadenascimento;



    public void entradaDoPrograma() {
        Scanner input = new Scanner(System.in);
        while (programaInicial) {

            System.out.printf("%n============================== Seja bem vindo ao sistema de cartões de benefícios Alelo! =============================" +
                    "%nDigite seu nome: ");
            String nomeDoBeneficiario = input.nextLine();
            nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

            //validador de cpf
//            boolean validadorCPF = true;
//            while (validadorCPF) {
//                System.out.printf("%nDigite seu cpf somente o numero: ");
//                 cpf = input.next();
//                if (cpf.length() !=11){
//                    System.out.printf("%n*** ERRO ***" +
//                            "%nO CPF digitado é inválido, por favor tente novamente.");
//                }
//                else{
//                    validadorCPF=false;
//                }
//
//            }

            System.out.printf("%nDigite seu cpf somente o numero: ");
            String cpf = input.next();

            //validador de datanascimento
//            boolean validadorData = true;
//            while (validadorData) {
//                System.out.printf("%nDigite seu datanascimento somente o numero: ");
//                datadenascimento = input.next();
//                if (datadenascimento.length() !=10){
//                    System.out.printf("%n*** ERRO ***" +
//                            "%nA datanascimento digitado é inválida, por favor tente novamente segunindo o modeleo xx/xx/xxxx.");
//                }
//                else{
//                    validadorData=false;
//                }
//
//            }

            System.out.printf("%nDigite sua data de nascimento : ");
            String datadenascimento = input.next();

            var usuario = Usuario.retornaUsuario(nomeDoBeneficiario, cpf, datadenascimento);
            usuario.criarCartoesParaUsuario();

            programaParaUsuarios = true;

            while (programaParaUsuarios) {
                System.out.printf("%n%n**************************************************" +
                        "%nOlá, %s" +
                        "%nEscolha qual opção você deseja realizar agora: " +
                        "%n1 - Usufruir do cartao" +
                        "%n2 - Abastecer o cartao" +
                        "%n3 - Mostrar saldo de cartão" +
                        "%n4 - Mostrar usuários cadastrados" +
                        "%n5 - Cadastrar novo usuário" +
                        "%n6 - Selecionar usuário cadastrado" +
                        "%n7 - Mostrar extrato" +
                        "%n9 - Desligar o programa" +
                        "%nOpção escolhida: ", nomeDoBeneficiario);
                tipoDeTransacao = input.nextInt();

                if (tipoDeTransacao == 1) {
                    programaParaUsuarios = false;
                    executarOMenuInicial = true;
                    usufruirDoPrograma(nomeDoBeneficiario);
                } else if (tipoDeTransacao == 2) {
                    if (administrador.acessoAdministrador()) {
                        System.out.printf("%nOlá, Teste.Administrador" +
                                "%nEscolha o cartao que você quer colocar saldo" +
                                "%n1 - Alelo Alimentação" +
                                "%n2 - Alelo Refeição" +
                                "%n3 - Alelo Mobilidade" +
                                "%n4 - Alelo Multibeneficios" +
                                "%n0 - Voltar para o menu anterior" +
                                "%nOpção escolhida: ");
                        valeSelecionadoPeloUsuario = input.nextInt();

                        if (valeSelecionadoPeloUsuario == 0) {
                            System.out.println("Voltando ao menu inicial...");
                            abastecimentoDeCartao = false;
                        } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
                            abastecimentoDeCartao = true;
                        } else {
                            System.out.printf("%nOpção inválida.");
                            abastecimentoDeCartao = false;
                        }
                    } else {
                        abastecimentoDeCartao = false;
                    }

                    while (abastecimentoDeCartao) {
                        System.out.printf("%nDigite o valor que você quer adicionar no cartão: R$ ");
                        Double valorASerAdicionado = input.nextDouble();

                        if (valorASerAdicionado < 0) {
                            System.out.printf("%nImpossível adicionar um valor negativo.");
                        } else {
                            InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                            cartaoDeBeneficiosAlelo.efetuarTransacao(valorASerAdicionado);
                            System.out.printf("O cartão foi adicionado em R$ %.2f", valorASerAdicionado);
                        }
                        abastecimentoDeCartao = false;
                    }

                } else if (tipoDeTransacao == 3) {
                    System.out.printf("%nOk, %s." +
                            "%nEscolha o cartao que você deseja ver o saldo" +
                            "%n1 - Alelo Alimentação" +
                            "%n2 - Alelo Refeição" +
                            "%n3 - Alelo Mobilidade" +
                            "%n4 - Alelo Multibeneficios" +
                            "%n5 - Todos os cartões" +
                            "%n0 - Voltar para o menu anterior" +
                            "%nOpção escolhida: ", nomeDoBeneficiario);
                    valeSelecionadoPeloUsuario = input.nextInt();

                    if (valeSelecionadoPeloUsuario == 0) {
                        System.out.println("Voltando ao menu inicial...");
                    } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
                        InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                        cartaoDeBeneficiosAlelo.mostraSaldoDoCartao(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                    } else if (valeSelecionadoPeloUsuario == 5) {
                        InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, 1);
                        cartaoDeBeneficiosAlelo.mostraSaldoDoCartao(nomeDoBeneficiario, 1);
                        cartaoDeBeneficiosAlelo.mostraSaldoDoCartao(nomeDoBeneficiario, 2);
                        cartaoDeBeneficiosAlelo.mostraSaldoDoCartao(nomeDoBeneficiario, 3);
                        cartaoDeBeneficiosAlelo.mostraSaldoDoCartao(nomeDoBeneficiario, 4);
                    }
                } else if (tipoDeTransacao == 4) {
                    int i = 1;
                    System.out.printf("%n************************************************" +
                            "%nLista de usuários cadastrados no programa:%n");
                    for (Usuario usuario1 : Usuario.dataBaseParaSelecionarUsuarios) {
                        System.out.printf("%d  - nome do cliente %s - cpf %s  - data de nascimento %s %n", i, usuario1.nomeDoBeneficiario, usuario1.cpf, usuario1.datadenascimento);
                        i += 1;
                    }
                    System.out.println("************************************************");
                } else if (tipoDeTransacao == 5) {
                    programaParaUsuarios = false;
                    programaInicial = true;
                    nomeDoBeneficiario.replace("A-Za-z", input.nextLine());
                } else if (tipoDeTransacao == 6) {
                    boolean encontrarNovoUsuario = true;
                    String armazenarNomeComoFoiDigitado = nomeDoBeneficiario;
                    while (encontrarNovoUsuario) {
                        nomeDoBeneficiario.replace("A-Za-z", input.nextLine());
                        System.out.printf("%nDigite o nome do usuário que você deseja buscar: ");
                        nomeDoBeneficiario = input.nextLine();
                        nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

                        if (Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario) != null) {
                            programaParaUsuarios = true;
                            encontrarNovoUsuario = false;
                        } else {
                            System.out.printf("%nO usuário não foi encontrado em nosso banco de dados." +
                                    "Deseja buscar um outro usuário cadastrado [s/n]? ");
                            if (input.next().charAt(0) == 'n') {
                                nomeDoBeneficiario = armazenarNomeComoFoiDigitado;
                                encontrarNovoUsuario = false;
                            }
                        }
                    }

                } else if (tipoDeTransacao == 7) {
                    System.out.printf("%nEscolha o cartao que você deseja ver o extrato" +
                            "%n1 - Alelo Alimentação" +
                            "%n2 - Alelo Refeição" +
                            "%n3 - Alelo Mobilidade" +
                            "%n4 - Alelo  Multibeneficios" +
                            "%n4 - Todos os cartões" +
                            "%n0 - Voltar para o menu anterior" +
                            "%nOpção escolhida: ");
                    opcaoDeExtrato = input.nextInt();

                    if (opcaoDeExtrato == 4) {
                        for (int i = 1; i < 5; i++) {
                            InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, i);
                            cartaoDeBeneficiosAlelo.mostrarExtratoDoCartao(nomeDoBeneficiario, i);
                        }
                    } else if (opcaoDeExtrato >= 1 && opcaoDeExtrato <= 4) {
                        InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, opcaoDeExtrato);
                        cartaoDeBeneficiosAlelo.mostrarExtratoDoCartao(nomeDoBeneficiario, opcaoDeExtrato);
                    } else {
                        System.out.printf("%nOpção inválida.");
                    }

                } else if (tipoDeTransacao == 9) {
                    input.close();
                    System.out.println("Obrigado por utilizar os cartões Alelo!");
                    executarOMenuInicial = false;
                    programaInicial = false;
                    programaParaUsuarios = false;
                }
            }
        }
    }


    public void usufruirDoPrograma(String nomeDoBeneficiario) {
        Scanner input = new Scanner(System.in);
        if (Estabelecimentos.estabelecimentos.size() == 0) {
            estabelecimentos.criarEstabelecimentosDisponiveisParaGastar();
        }

        while (executarOMenuInicial) {
            System.out.printf("%n%n**************************************************" +
                    "%nOlá, %s!" +
                    "%nEscolha qual cartão você quer utilizar:" +
                    "%n1 - Alelo Alimentação" +
                    "%n2 - Alelo Refeição" +
                    "%n3 - Alelo Mobilidade" +
                    "%n4 - Alelo Multibenefícios" +
                    "%n9 - Desligar programa" +
                    "%n0 - Retornar ao menu anterior" +
                    "%nOpção escolhida: ", nomeDoBeneficiario);
            int valeSelecionadoPeloUsuario = input.nextInt();

            if (valeSelecionadoPeloUsuario == 0) {
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = true;
                entradaDoPrograma();

            } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
                InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosAlelo = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);

                System.out.printf("%n%n**************************************************" +
                        "%nEscolha o estabelecimento onde ocorrerá a compra%n");
                for (int i = 0; i < Estabelecimentos.estabelecimentos.size(); i++) {
                    System.out.printf("%d - %s%n", (Estabelecimentos.estabelecimentos.get(i).identificadorDoEstabelecimento()), Estabelecimentos.estabelecimentos.get(i).razaoSocial);
                }
                System.out.printf("%nDigite o identificador do local desejado: ");
                int opcaoDeEstabelecimentoEscolhidaPeloUsuario = input.nextInt();

                if (opcaoDeEstabelecimentoEscolhidaPeloUsuario >= 1 && opcaoDeEstabelecimentoEscolhidaPeloUsuario <= Estabelecimentos.estabelecimentos.size()) {
                    System.out.print("Digite o valor a ser gasto: ");
                    Double valorASerGastoPeloUsuario = input.nextDouble();

                    cartaoDeBeneficiosAlelo.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario,
                            Estabelecimentos.estabelecimentos.get(opcaoDeEstabelecimentoEscolhidaPeloUsuario - 1));
                } else {
                    System.out.printf("%n*** ERRO! ***" +
                            "%nCódigo de estabelecimento inválido. ");
                }

            } else if (valeSelecionadoPeloUsuario == 9) {
                input.close();
                System.out.println("Obrigado por utilizar os cartões Alelo!");
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = false;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
