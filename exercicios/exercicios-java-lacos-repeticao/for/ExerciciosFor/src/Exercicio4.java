/* Números ímpares de 1 a N
Peça um número inteiro N ao usuário e use um for para exibirtodos os 
números ímpares de 1 até N.*/

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero inteiro: ");
    int N = scanner.nextInt();

    for (int i = 1; i < N; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }

    }
    scanner.close();
  }

}
