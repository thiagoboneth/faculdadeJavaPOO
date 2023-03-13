package exercicio1.model;

public class Cliente extends Pessoa{
    String cpf;
    String login;
    int senha;

        public Cliente(String nome, String cpf, String login, int senha){
            super(nome);
            this.cpf = cpf;
            this.login = login;
            this.senha = senha;
        }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

        @Override
        public String toString() {
        return "Meu nome é: " + this.nome + " e meu CPF é: " + this.cpf;
    }
}
