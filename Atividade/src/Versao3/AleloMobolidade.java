package Versao3;

public class AleloMobolidade extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {

    private final Integer senhaDoCartaoVC = 12345;
    private Double saldoAtualDoCartao = 1000.00;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVC) {
        return senhaDoCartaoVC.equals(this.senhaDoCartaoVC);
    }


    public String nomeDoCartao() {
        return "VC";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}
