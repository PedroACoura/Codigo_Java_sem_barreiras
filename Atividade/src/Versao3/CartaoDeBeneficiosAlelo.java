package Versao3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class CartaoDeBeneficiosAlelo {

    SistemaDeSeguranca sistemaDeSeguranca = new SistemaDeSeguranca();
    final ArrayList<Transacao> listaParaMostrarOExtrato = new ArrayList<>();
    public LocalDateTime validadeDoCartao = LocalDateTime.now().plus(5, ChronoUnit.DAYS);

    InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen;

    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);

        if (sistemaDeSeguranca.cartaoVANaePassaCombustivel(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (sistemaDeSeguranca.cartaoVCEstaSendoUtilizadoEmCombustivel(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (!sistemaDeSeguranca.senhaDoCartaoEstaCorreta(cartaoDeBeneficiosNewGen)) {
        } else if (sistemaDeSeguranca.valorNegativo(valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.valorMaiorQueSaldo(cartaoDeBeneficiosNewGen, valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.sistemaAntiFraude1(listaParaMostrarOExtrato, estabelecimentoUtilizadoPeloPrograma.razaoSocial, valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.sistemaAntiFraude2(listaParaMostrarOExtrato)) {
        } else if (sistemaDeSeguranca.cartaoVCPassaCompraEmMaisDeDoisMinutos(listaParaMostrarOExtrato, cartaoDeBeneficiosNewGen)) {
        } else if (sistemaDeSeguranca.cartaoEstaNaValidade(validadeDoCartao)) {
        } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VA")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.03;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("%nA compra em %s de R$ %.2f foi aprovada com sucesso!" +
                    "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma.razaoSocial, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.03, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

        } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VR")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.02;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("%nA compra em %s de R$ %.2f foi aprovada com sucesso!" +
                    "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.02, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

        } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VC")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.05 -1;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("A compra em %s de R$ %.2f foi aprovada com sucesso! " +
                    "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                    "%nA compra gerou uma taxa de R$ 1.00 que já foi debitado de seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma.razaoSocial, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.05, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
        } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VM")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.04;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("A compra em %s de R$ %.2f foi aprovada com sucesso! " +
                    "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma.razaoSocial, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.04, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
        }


    }


    public void armazenarCompra(Double valorASerGastoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma, String nomeDoBeneficiario) {
        listaParaMostrarOExtrato.add(new Transacao(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario));
    }

    public void mostrarExtratoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
        System.out.printf("%n######################### EXTRATO DO CARTÃO #########################" +
                "%n############################# CARTÃO %s #############################", cartaoDeBeneficiosNewGen.nomeDoCartao());

        if (listaParaMostrarOExtrato.size() == 0) {
            System.out.printf("%nAinda não há compras efetuadas neste cartão.%n");
        } else {
            for (Transacao paraMostrarOExtrato : listaParaMostrarOExtrato) {
                System.out.println(paraMostrarOExtrato);
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public void mostraSaldoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
        System.out.printf("%n* O saldo do cartão %s é R$ %.2f", cartaoDeBeneficiosNewGen.nomeDoCartao(), cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
    }
}
