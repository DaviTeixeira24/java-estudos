/* Tabuada com For:
Escreva um programa que receba um número inteiro do 
usuário e exiba sua tabuada de 1 a 10 usando um loop for.*/

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    System.out.println("Tabada do numero digitado: ");

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " X " + i + " = " + (numero * i));
    }
    scanner.close();
  }
}
