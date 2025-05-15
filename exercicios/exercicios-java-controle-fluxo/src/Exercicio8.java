/*Peça uma temperatura em graus Celsius.
Use if/else para classificar:

Abaixo de 0: "Congelante"

Entre 0 e 15: "Frio"

Entre 16 e 25: "Agradável"

Acima de 25: "Quente" */

import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos graus estão marcando na sua cidade?");
    int temperatura = scanner.nextInt();

    if (temperatura < 0) {
      System.out.println("Congelante!");
    } else if (temperatura >= 0 && temperatura <= 15) {
      System.out.println("Frio");
    } else if (temperatura >= 16 && temperatura <= 25) {
      System.out.println("Agradavel");
    } else if (temperatura > 25) {
      System.out.println("Quente");
    }
    scanner.close();
  }
}
