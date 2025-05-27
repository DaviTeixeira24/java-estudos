/*Use do-while para permitir que o usuário cadastre nomes (Strings). Após cada nome, 
pergunte se ele deseja continuar cadastrando (S/N). */

import java.util.Scanner;

public class Exercicio3Corrigido {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nomes = "";
    String opcoes;

    do {

      System.out.println("Nome: ");
      String nomeDigitado = scanner.nextLine();

      nomes += nomeDigitado + ", ";

      System.out.println("Deseja continuar? (S/N): ");
      opcoes = scanner.nextLine().trim(); // obs: "trim" serve para dorrigir erro do susario. ex: "S " ou " s"

    } while (!opcoes.equalsIgnoreCase("N")); // método para comparar strings.(ignorano letras maiusculas ou minusculas)

    System.out.println("Os nomes digitados foram: " + nomes);
    scanner.close();

  }

}
