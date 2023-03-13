package exercicio1.model;

import java.util.Objects;

public class Funcionario extends Cliente{
    int matricula;

        public Funcionario(String nome, String cpf, String login, int senha, int matricula){
            super(nome, cpf, login, senha);
            this.matricula = matricula;
        }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public void venda(String login, int senha, String nomeProduto, int valor){
            if (Objects.equals(this.login, login) && autentica(senha)){
                System.out.println("O produto " + nomeProduto + " foi vendido no valor de " + valor);
            } else {
                System.out.println("Venda não autorizada, usuário de venda incorreto");
            }
    }

        @Override
        public String toString() {
        return "Meu nome é: " + this.nome + " e meu CPF é: " + this.cpf + " e minha matricula é: " + this.matricula;
    }
}
