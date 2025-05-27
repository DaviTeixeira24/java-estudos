/* Número entre 1 e 10
Peça um número ao usuário e continue pedindo até ele digitar um número entre 1 e 10, usando do-while.*/

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double numero;

    do {

      System.out.println("Digite um numero: ");
      numero = scanner.nextInt();

      if (numero > 1 || numero < 10) {
        System.out.println("Condição não Atendida! digite novamente...");
      }

    } while (numero < 1 || numero > 10); // obs: aqui utilizamos ||(operador lógico "ou") pois na é necxessario que as
                                         // duas condições sejam verdadeiras

    System.out.println("Você atendeu a condição!!");
    scanner.close();
  }
}
