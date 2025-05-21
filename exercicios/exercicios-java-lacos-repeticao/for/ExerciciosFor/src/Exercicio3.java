/*3. Fatorial de um número
Peça ao usuário um número inteiro positivo e use um for para 
calcular o fatorial dele (ex: 5! = 5 × 4 × 3 × 2 × 1). */

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numer inteiro: ");
    int numero = scanner.nextInt();

    int fac = 1;

    for (int i = numero; i >= 1; i--) {
      fac *= i;
    }
    System.out.println(fac);

    scanner.close();
  }
}
