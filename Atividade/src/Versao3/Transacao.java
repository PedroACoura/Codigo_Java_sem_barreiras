package Versao3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {

    public Double valorDaTransacao;
    public LocalDateTime horarioDaTransacao;
    public Estabelecimento estabelecimentoUtilizadoPeloPrograma;
    public String nomeDoBeneficiario;
    DateTimeFormatter formatacaoDaHoraParaOPadraoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
    public long contadorTransferencias=0;

    public Transacao(Double valorDaTransacao, Estabelecimento estabelecimentoUtilizadoPeloPrograma, String nomeDoBeneficiario) {
        this.contadorTransferencias=contadorTransferencias;
        this.valorDaTransacao = valorDaTransacao;
        this.horarioDaTransacao = LocalDateTime.now();
        this.nomeDoBeneficiario = nomeDoBeneficiario;
        this.estabelecimentoUtilizadoPeloPrograma = estabelecimentoUtilizadoPeloPrograma;
        contadorTransferencias+=1;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + contadorTransferencias + "   " +
                horarioDaTransacao.format(formatacaoDaHoraParaOPadraoBrasileiro) + "   " +
                estabelecimentoUtilizadoPeloPrograma.estadosUF + "    " +
                estabelecimentoUtilizadoPeloPrograma.razaoSocial + "   " +
                valorDaTransacao;
    }
}

