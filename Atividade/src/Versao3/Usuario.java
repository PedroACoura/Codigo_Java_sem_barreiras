package Versao3;

import java.util.*;

public class Usuario {

    private Scanner teclado = new Scanner(System.in);
    public static final List<Usuario> dataBaseParaSelecionarUsuarios = new ArrayList<>();
    List<InterfaceCartaoDeBeneficiosAlelo> listaDeCartoes = new ArrayList<>();
    String nomeDoBeneficiario;
    String datadenascimento;
    String cpf;
    //Integer contadorDeCartao = 0;


    public Usuario(String nomeDoBeneficiario, String cpf, String datadenascimento) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
        this.cpf = cpf;
        this.datadenascimento = datadenascimento;
    }

    public Usuario(String nomeDoBeneficiario) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
    }

//    public Usuario(long cpf) {
//        this.cpf = cpf;
//    }

    public static Usuario retornaUsuario(String nomeDoBeneficiario, String cpf, String datadenascimento) {
        var usuarioParaPesquisar = new Usuario(nomeDoBeneficiario, cpf, datadenascimento);
        if (dataBaseParaSelecionarUsuarios.contains(usuarioParaPesquisar)) {
            return dataBaseParaSelecionarUsuarios.get(dataBaseParaSelecionarUsuarios.indexOf(usuarioParaPesquisar));
        }
        var usuarioNovo = new Usuario(nomeDoBeneficiario, cpf, datadenascimento);
        dataBaseParaSelecionarUsuarios.add(usuarioNovo);
        return usuarioNovo;
    }


    public static Usuario retornaUsuarioPeloNomeDoBeneficiario(String nomeDoBeneficiario) {
        var usuarioParaPesquisar = new Usuario(nomeDoBeneficiario);
        if (dataBaseParaSelecionarUsuarios.contains(usuarioParaPesquisar)) {
            return dataBaseParaSelecionarUsuarios.get(dataBaseParaSelecionarUsuarios.indexOf(usuarioParaPesquisar));
        }
        return usuarioParaPesquisar;
    }

    //---------------------------------------------------------------------------------------------------------------------
//                   else if  ok mas bug na repetição do menu
    public void criarCartoesParaUsuario() {
        boolean criacaoDeCartao = true;
        while (criacaoDeCartao) {

            System.out.printf("%nDigite qual Cartão deseja adicionae para o usuário" +
                    "%n1 - Alelo Alimentação" +
                    "%n2 - Alelo Refeição" +
                    "%n3 - Alelo Mobilidade" +
                    "%n4 - Alelo Multibenefícios" +
                    "%n9 - Para voltar ao menu principal" +
                    "%nOpção ->");
            int opçãoDigitada = teclado.nextInt();
            System.out.println("O usuário está sendo cadastro no sistema Alelo. Favor aguardar uns instantes.");
            if (opçãoDigitada == 1) {
                if (listaDeCartoes.size() == 0) {
                    listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
                    System.out.println("Cartão Alelo Alimentação foi criado para o usuário");
                    criacaoDeCartao = true;
                }

                for (int i = 0; i < listaDeCartoes.size(); i++) {
                    if (listaDeCartoes.get(i).nomeDoCartao().equals("VA")) {
                        System.out.println("O usuário já possui o cartão Alelo Alimentação");
                        break;
                    } else {
                        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
                        System.out.println("Cartão Alelo Alimentação criado para o usuário");
                        break;
                    }

                }
            }
            if (opçãoDigitada == 2) {
                if (listaDeCartoes.size() == 0) {
                    listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
                    System.out.println("Cartão Alelo Refeição foi criado para o usuário");
                } else {
                    for (int i = 0; i < listaDeCartoes.size(); i++) {
                        if (listaDeCartoes.get(i).nomeDoCartao().equals("VR")) {
                            System.out.println("O usuário já possui o cartão Alelo Refeição");
                            break;
                        } else {
                            listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
                            System.out.println("Cartão Alelo Refeição foi criado para o usuário");
                         break;
                        }
                    }

                }
            }
            if (opçãoDigitada == 3) {
                if (listaDeCartoes.size() == 0) {
                    listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
                    System.out.println("Cartão Alelo Mobilidade foi criado para o usuário");
                } else {
                    for (int i = 0; i < listaDeCartoes.size(); i++) {
                        if (listaDeCartoes.get(i).nomeDoCartao().equals("VC")) {
                            System.out.println("O usuário já possui o cartão Alelo Mobilidade");
                           break;
                        } else {
                            listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
                            System.out.println("Cartão Alelo Mobilidade criado para o usuário");
                          break;
                        }
                    }

                }
            }
            if (opçãoDigitada == 4) {
                if (listaDeCartoes.size() == 0) {
                    listaDeCartoes.add(TiposDeCartaoDeBeneficio.VM.fabricar());
                    System.out.println("Cartão Alelo Mobilidade foi criado para o usuário");
                } else {
                    for (int i = 0; i < listaDeCartoes.size(); i++) {
                        if (listaDeCartoes.get(i).nomeDoCartao().equals("VM")) {
                            System.out.println("O usuário já possui o cartão Alelo Mobilidade");
                            break;
                        } else {
                            listaDeCartoes.add(TiposDeCartaoDeBeneficio.VM.fabricar());
                            System.out.println("Cartão Alelo Multibeneficio criado para o usuário");
                            break;
                        }
                    }

                }
            }

            if (opçãoDigitada == 9) {
                criacaoDeCartao = false;
            }
        }
    }



        //------------------------------------------------------------------------------------------------------------------
        // swict
//    public void criarCartoesParaUsuario() {
//        if (this.listaDeCartoes.size() > 0) {
//            return;
//        }
//        System.out.println("O usuário está sendo cadastro no sistema Alelo. Favor aguardar uns instantes.");
//        var opçãoDigitada = 0;
//        boolean continuarCriando = true;
//        while (continuarCriando) {
//            System.out.printf("%nDigite qual Cartão deseja adicionae para o usuário" +
//                    "%n1 - Alelo Alimentação" +
//                    "%n2 - Alelo Refeição" +
//                    "%n3 - Alelo Combustível" +
//                    "%n4 - Alelo Multibenefícios" +
//                    "%n9 - Para voltar ao menu principal" +
//                    "%nOpção ->");
//            opçãoDigitada = teclado.nextInt();
//            boolean jaPossui = false;
//            switch (opçãoDigitada) {
//                case 1:
//                    if (listaDeCartoes.size() == 0) {
//                        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
//                        System.out.println("Cartão Alelo Alimentação foi criado para o usuário");
//                    }
//                    for (int i = 0; i < listaDeCartoes.size() + 1; i++) {
//                        i++;
//                        if (listaDeCartoes.get(i).nomeDoCartao().equals("VA")) {
//                            //jaPossui = true;
//                        }
//                        if (jaPossui) {
//                            System.out.println("O usuário já possui o cartão");
//                        } else {
//                            listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
////                            System.out.println(contadorDeCartao);
////                            contadorDeCartao++;
//                            System.out.println("Cartão Alelo Alimentação criado com sucesso!!!");
//                        }
//
//                    }
//                    break;
//                case 9:
//                    continuarCriando = false;
//                    break;
//            }
//
//        }
//    }


        //------------------------------------------------------------------------------------------------------------------


// bom funcionando
//    public void criarCartoesParaUsuario() {
//        if (this.listaDeCartoes.size() > 0) {
//            return;
//        }
//        System.out.println("O usuário está sendo cadastro no sistema Alelo. Favor aguardar uns instantes.");
//
//        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
//        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
//        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
//        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VM.fabricar());
//        System.out.printf("%nCartão de Alelo Alimentação da Alelo criado com sucesso..." +
//                "%nCartão de Alelo Refeição da Alelo criado com sucesso..." +
//                "%nCartão de Alelo Mobilidade da Alelo criado com sucesso..." +
//                "%nCartão de Alelo Multibenefícios da Alelo criado com sucesso..." +
//                "%nUsuário cadastrado com sucesso! Seja bem vindo!" +
//                "%nTodos os cartões contam a cortesia de serem iniciados com R$ 1000,00. Aproveite!");
//    }

        public static InterfaceCartaoDeBeneficiosAlelo retornarCartaoDeBeneficiosUtilizadoPeloUsuario (String
        nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario){
            return (retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario).listaDeCartoes.get(valeSelecionadoPeloUsuario - 1));
        }


        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Usuario usuario = (Usuario) o;
            return Objects.equals(nomeDoBeneficiario, usuario.nomeDoBeneficiario);
        }

        @Override
        public int hashCode () {
            return Objects.hash(nomeDoBeneficiario);
        }
    }
