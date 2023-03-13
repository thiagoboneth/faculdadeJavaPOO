package exercicio1;

import exercicio1.model.Cliente;
import exercicio1.model.Funcionario;
import exercicio1.model.Gerente;
import exercicio1.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        var pessoa1 = new Pessoa("BONETH");
        var cliente1 = new Cliente("Luis","12312312332","luizito",1234);
        var funcionario = new Funcionario("Carlos","123123123","carlinhos",123,567);
        var gerente = new Gerente("Pedro","234234234","pedrinho",345,1234);

        if (gerente.caixaFechado(false)){
            System.out.println("Funcionário não autorizado para venda");
        } else {
            System.out.println("Funcionário autorizado para vender");
            funcionario.venda("carlinhos",123,"Arroz",5);
        }
    }
}
