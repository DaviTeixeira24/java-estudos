/*Use do-while para permitir que o usuário cadastre nomes (Strings). Após cada nome, 
pergunte se ele deseja continuar cadastrando (S/N). */

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Cadastre os nomes.");

    String nomes = "";
    String opcoes = "";

    do {
      System.out.println("Nome: ");
      nomes = scanner.nextLine();

      System.out.println("Deseja contunuar? Digite a opção (S) para sim, e (N) para não");
      opcoes = scanner.nextLine();

    } while (opcoes == "N");

    System.out.println("Os nomes digidatos foram: " + nomes);
    scanner.close();
  }
}
