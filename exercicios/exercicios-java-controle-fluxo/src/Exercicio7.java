/* Peça ao usuário qual turno ele estuda (M = manhã, V = vespertino, N = noturno).
Use switch para exibir uma saudação apropriada.*/

import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o turno em que você estuda: ");
    String turno = scanner.nextLine();

    switch (turno) {
      case "M": {
        System.out.println("Então você estuda no turno da manhã...");
        break;
      }
      case "V": {
        System.out.println("Então você estuda no turno da tarde(vespertino)...");
        break;
      }
      case "N": {
        System.out.println("Então você estuda no turno da noite(noturno)...");
        break;
      }

      default:
        System.out.println("Só existem 3 turnos!");
        break;
    }
    scanner.close();
  }
}
