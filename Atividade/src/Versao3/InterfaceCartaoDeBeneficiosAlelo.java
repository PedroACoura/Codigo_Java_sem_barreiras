package Versao3;

public interface InterfaceCartaoDeBeneficiosAlelo {

    void adicionarNovaTransacao(Double valorASerGastoPeloUsuario,/*Double cashback,*/ String nomeDoBeneficiario,
                                Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma);

    Boolean senhaDoCartao(Integer senhaDoCartao);

    Boolean codigoDoCartao(Integer codigoDoCartao);

    String nomeDoCartao();

    Double saldoAtualDoCartao();

    void efetuarTransacao(Double valorASerDebitado);

    void mostrarExtratoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario);

    void mostraSaldoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario);
}
