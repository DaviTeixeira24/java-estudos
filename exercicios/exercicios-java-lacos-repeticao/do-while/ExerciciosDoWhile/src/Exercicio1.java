
/* Crie um menu com opções (1 - Ver Perfil, 2 - Editar Perfil, 0 - Sair). 
Use do-while para repetir até que o usuário escolha a opção 0.*/

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Opções do programa: 1- Ver Perfil; 2- Editar Perfil e 0- Sair do programa");
    int opcao = 0;

    do {

      System.out.println("Escola uma das opções: ");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        System.out.println("Você esta na aba de Perfil!");
      } else if (opcao == 2) {
        System.out.println("Você esta na aba de Edição do Perfil!");
      }

    } while (opcao != 0);

    System.err.println("Voce saiu do programa!");
    scanner.close();
  }
}
