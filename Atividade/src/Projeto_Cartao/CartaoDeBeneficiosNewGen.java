package Projeto_Cartao;

import java.time.LocalDateTime;

public abstract class CartaoDeBeneficiosNewGen {
    public int saldo=1000;
    public LocalDateTime validade;
    public String usuario;
    public int senha;

    public Integer getSaldo() {
        return saldo;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void trasiscao() {

    }

    public void antifraude() {

    }

    public void estrato() {

    }

}