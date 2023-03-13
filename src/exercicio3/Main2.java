package exercicio3;

import exercicio3.model.Animal;
import exercicio3.model.Cao;
import exercicio3.model.Gato;
import exercicio3.model.Homem;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Animal[] animais = new Animal[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animais.length; i++) {
            System.out.println("Digite o tipo de animal (H para Homem, C para Cão, G para Gato):");
            String tipo = scanner.nextLine().toUpperCase();
            switch (tipo) {
                case "H" -> animais[i] = new Homem();
                case "C" -> animais[i] = new Cao();
                case "G" -> animais[i] = new Gato();
                default -> {
                    System.out.println("Tipo de animal inválido. Digite novamente.");
                    i--;
                }
            }
        }
        scanner.close();
        for (Animal animal : animais) {
            System.out.println(animal.somAnimal());
        }
    }
}
