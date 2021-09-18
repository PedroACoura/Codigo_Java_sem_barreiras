package Versao3;

public class AleloAlimentacao extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {

    private final Integer senhaDoCartaoVA = 1234;
    private Double saldoAtualDoCartao = 1000.00;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVA) {
        return senhaDoCartaoVA.equals(this.senhaDoCartaoVA);
    }

    public String nomeDoCartao() {
        return "VA";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }


    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }


}


