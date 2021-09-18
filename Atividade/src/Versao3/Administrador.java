package Versao3;

import java.util.Scanner;

public class Administrador {
    Integer senha = 321;

    public boolean acessoAdministrador() {
        Scanner senhaAdmin = new Scanner(System.in);
        System.out.printf("%nAcesso somente para administradores. Digite a senha: ");
        int senhaDigitada = senhaAdmin.nextInt();
        if (senhaDigitada == senha) {
            return true;
        } else {
            System.out.printf("%n*** ERRO! ***" +
                    "%nA senha digitada está incorreta.");
            return false;
        }
    }
}