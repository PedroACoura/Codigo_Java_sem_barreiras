package Versao3;

public class AleloMultibenficio extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {


    private final Integer senhaDoCartaoVM = 3456;
    private Double saldoAtualDoCartao = 1000.00;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVA) {
        return senhaDoCartaoVA.equals(this.senhaDoCartaoVM);
    }

    public String nomeDoCartao() {
        return "VM";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }


    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }


}


