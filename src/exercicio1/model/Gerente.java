package exercicio1.model;

public class Gerente extends Funcionario{
    boolean caixaFechado;

        public Gerente(String nome, String cpf, String login, int senha, int matricula){
            super(nome, cpf, login, senha, matricula);
        }

        public boolean caixaFechado(boolean caixa){
            if (this.caixaFechado == caixa){
                return false;
            } else {
                return true;
            }
        }


        @Override
        public String toString() {
        return "Meu nome é: " + this.nome + " e meu CPF é: " + this.cpf + " e minha matricula é: " + this.matricula;
    }
}
