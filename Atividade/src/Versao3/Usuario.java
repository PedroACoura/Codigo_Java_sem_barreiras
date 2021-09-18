package Versao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    public static final List<Usuario> dataBaseParaSelecionarUsuarios = new ArrayList<>();
    List<InterfaceCartaoDeBeneficiosAlelo> listaDeCartoes = new ArrayList<>();
    String nomeDoBeneficiario;

    public Usuario(String nomeDoBeneficiario) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
    }

    public static Usuario retornaUsuarioPeloNomeDoBeneficiario(String nomeDoBeneficiario) {
        var usuarioParaPesquisar = new Usuario(nomeDoBeneficiario);
        if (dataBaseParaSelecionarUsuarios.contains(usuarioParaPesquisar)) {
            return dataBaseParaSelecionarUsuarios.get(dataBaseParaSelecionarUsuarios.indexOf(usuarioParaPesquisar));
        }
        var usuarioNovo = new Usuario(nomeDoBeneficiario);
        dataBaseParaSelecionarUsuarios.add(usuarioNovo);
        return usuarioNovo;
    }

    public void criarCartoesParaUsuario() {
        if (this.listaDeCartoes.size() > 0) {
            return;
        }
        System.out.println("O usuário está sendo cadastro no sistema Alelo. Favor aguardar uns instantes.");
        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
        listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
        System.out.printf("%nCartão de Alelo Alimentação NewGen criado com sucesso..." +
                "%nCartão de Alelo Refeição NewGen criado com sucesso..." +
                "%nCartão de Alelo Combustível da Alelo criado com sucesso..." +
                "%nCartão de Alelo Multibenefícios da Alelo criado com sucesso..." +
                "%nUsuário cadastrado com sucesso! Seja bem vindo!" +
                "%nTodos os cartões contam a cortesia de serem iniciados com R$ 1000,00. Aproveite!");
    }

    public static InterfaceCartaoDeBeneficiosAlelo retornarCartaoDeBeneficiosUtilizadoPeloUsuario(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        return (retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario).listaDeCartoes.get(valeSelecionadoPeloUsuario - 1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nomeDoBeneficiario, usuario.nomeDoBeneficiario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoBeneficiario);
    }
}
