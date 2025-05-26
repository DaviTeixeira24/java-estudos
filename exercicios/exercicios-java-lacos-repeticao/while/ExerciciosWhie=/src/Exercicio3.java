/*  Caixa eletrônico simplificado
Dado um valor inicial em conta (ex: 100 reais), use while 
para permitir saques até que o saldo acabe ou o usuário decida sair.*/

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int saldo = 100;

    while (saldo >= 0) {

      System.out.println("Saldo disponivel para saque: " + saldo);

      System.out.println("Digite o valor do saque: ");
      double saque = scanner.nextDouble();

      saldo -= saque;

    }

    System.out.println("Saldo Indisponivel!");
    scanner.close();
  }
}
