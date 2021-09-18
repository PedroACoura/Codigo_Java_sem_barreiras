import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeSeguranca {

    public boolean cartaoVANaePassaCombustivel(InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen, String estabelecimentoUtilizadoPeloPrograma) {
        if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VA") && estabelecimentoUtilizadoPeloPrograma.equals("Combustível")) {
            System.out.printf("%n*** ERRO! ***" +
                    "%nO cartão de vale alimentação não pode ser utilizado em posto de combustível. Tente outro cartão.");
            return true;
        }
        return false;
    }

    public boolean cartaoVCEstaSendoUtilizadoEmCombustivel(InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen, String estabelecimentoUtilizadoPeloPrograma) {
        if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VC") && !estabelecimentoUtilizadoPeloPrograma.equals("POSTO_COMBUSTIVEL")) {
            System.out.printf("%n*** ERRO ***" +
                    "%nO cartão de combustível pode ser utilizado somente em posto de combustível.");
            return true;
        }
        return false;
    }

    public boolean senhaDoCartaoEstaCorreta(InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen) {
        Scanner escanearSenha = new Scanner(System.in);
        System.out.print("Digite a senha do cartão: ");
        Integer senhaDoCartaoDigitaPeloUsuario = escanearSenha.nextInt();
        if (cartaoDeBeneficiosNewGen.senhaDoCartao(senhaDoCartaoDigitaPeloUsuario)) {
            return true;
        } else {
            System.out.printf("%n*** ERRO! ***" +
                    "%nA senha digitada está incorreta.");
            return false;
        }

    }

    public boolean valorNegativo(Double valorASerGastoPeloUsuario) {
        if (valorASerGastoPeloUsuario < 0) {
            System.out.printf("%n*** ERRO! ***" +
                    "%nO valor digitado está incorreto, não é possível inserir valor negativo. Procedimento não realizado.");
            return true;
        }
        return false;
    }

    public boolean valorMaiorQueSaldo(InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen, Double valorASerGastoPeloUsuario) {
        if (valorASerGastoPeloUsuario > cartaoDeBeneficiosNewGen.saldoAtualDoCartao()) {
            System.out.printf("%n*** ERRO! ***" +
                    "%nO valor da compra é maior que o disponível em saldo. Procedimento não realizado.");
            return true;
        }
        return false;
    }


    public long diferencaDeTempoEntreUltimaCompraEAgora(ArrayList<Transacao> listaParaMostrarOExtrato) {
        if (listaParaMostrarOExtrato.size() > 0) {
            int indiceDoPenultimoElemento = listaParaMostrarOExtrato.size() - 1;
            Duration diferencaDeTempo = Duration.between(LocalDateTime.now(), listaParaMostrarOExtrato.get(indiceDoPenultimoElemento).horarioDaTransacao);
            return (Math.abs(diferencaDeTempo.toSeconds()));
        }
        return 120;
    }

    public boolean segurancaComprasDeMenosDe30Segundos(ArrayList<Transacao> listaParaMostrarOExtrato) {
        return diferencaDeTempoEntreUltimaCompraEAgora(listaParaMostrarOExtrato) < 30;
    }

    public boolean compraNoMesmoEstabelecimento(ArrayList<Transacao> listaParaMostrarOExtrato, String nomeDoEstabelecimento) {
        if (listaParaMostrarOExtrato.size() > 0) {
            int indiceDoUltimoElemento = listaParaMostrarOExtrato.size() - 1;
            return nomeDoEstabelecimento.equals(listaParaMostrarOExtrato.get(indiceDoUltimoElemento).estabelecimentoUtilizadoPeloPrograma.razaoSocial);
        }
        return false;
    }

    public boolean noMesmoValor(ArrayList<Transacao> listaParaMostrarOExtrato, Double valorASerGastoPeloUsuario) {
        if (listaParaMostrarOExtrato.size() > 0) {
            int indiceDoUltimoElemento = listaParaMostrarOExtrato.size() - 1;
            return valorASerGastoPeloUsuario.equals(listaParaMostrarOExtrato.get(indiceDoUltimoElemento).valorDaTransacao);
        }
        return false;
    }

    public boolean sistemaAntiFraude1(ArrayList<Transacao> listaParaMostrarOExtrato, String nomeDoEstabelecimento, Double valorASerGastoPeloUsuario) {
        if (segurancaComprasDeMenosDe30Segundos(listaParaMostrarOExtrato) &&
                compraNoMesmoEstabelecimento(listaParaMostrarOExtrato, nomeDoEstabelecimento) &&
                noMesmoValor(listaParaMostrarOExtrato, valorASerGastoPeloUsuario)) {
            System.out.printf("%n*** ERRO! ***" +
                    "%nTransação não realizada. Espere %d segundos para efetuar esta compra.", (30 - diferencaDeTempoEntreUltimaCompraEAgora(listaParaMostrarOExtrato)));
            return true;
        }
        return false;
    }

    public boolean sistemaAntiFraude2(ArrayList<Transacao> listaParaMostrarOExtrato) {
        if (listaParaMostrarOExtrato.size() > 1) {
            int indiceDoPenultimoElemento = listaParaMostrarOExtrato.size() - 2;
            Duration diferencaDeTempo = Duration.between(LocalDateTime.now(), listaParaMostrarOExtrato.get(indiceDoPenultimoElemento).horarioDaTransacao);
            if (Math.abs(diferencaDeTempo.toSeconds()) < 60) {
                System.out.printf("%n*** ERRO! ***" +
                        "%nTransação não realizada. Espere %d segundos para efetuar esta compra.", (60 - Math.abs(diferencaDeTempo.toSeconds())));
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean segurancaComprasDeMenosDe120Segundos(ArrayList<Transacao> listaParaMostrarOExtrato) {
        return diferencaDeTempoEntreUltimaCompraEAgora(listaParaMostrarOExtrato) < 120;
    }

    public boolean cartaoVCPassaCompraEmMaisDeDoisMinutos(ArrayList<Transacao> listaParaMostrarOExtrato, InterfaceCartaoDeBeneficiosAlelo cartaoDeBeneficiosNewGen) {
        if (listaParaMostrarOExtrato.size() > 0) {
            if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("VC") && segurancaComprasDeMenosDe120Segundos(listaParaMostrarOExtrato)) {
                System.out.printf("%n*** ERRO! ***" +
                        "%nEspere %d segundos para efetuar uma nova compra no Vale Combustível.", (120 - Math.abs(diferencaDeTempoEntreUltimaCompraEAgora(listaParaMostrarOExtrato))));
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean cartaoEstaNaValidade(LocalDateTime validadeDoCartao) {
        if (validadeDoCartao.compareTo(LocalDateTime.now()) < 0) {
            System.out.println("*** ERRO! ***");
            System.out.println("O seu cartão está vencido há " + ChronoUnit.DAYS.between(validadeDoCartao, LocalDateTime.now()) + " dia(s).");
            return true;
        }
        return false;
    }

}
