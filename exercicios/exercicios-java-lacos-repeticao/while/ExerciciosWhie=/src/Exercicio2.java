/*Peça um número ao usuário e use while para exibir a contagem regressiva até 0. */

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero inteiro:");
    int numero = scanner.nextInt();

    while (numero > 0) {

      numero--;
      System.out.println(numero);
    }

    scanner.close();
  }
}
