/*Validação de Senha
Peça uma senha ao usuário e continue 
pedindo até que ele digite a senha correta ("12345"). Use do-while */

import java.util.Scanner;

public class exercicio2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int senha = 0;

    do {

      System.out.println("Digite a senha: ");
      senha = scanner.nextInt();

      if (senha != 12345) {
        System.out.println("Senha Incorreta!");
      }

    } while (senha != 12345);

    System.out.println("Acessando...");
    scanner.close();
  }

}
