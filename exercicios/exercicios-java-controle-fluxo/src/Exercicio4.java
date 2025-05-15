/*🕹️ 4. Menu de Opções com switch
Crie um menu simples com opções (1 a 4), como:

1.Cadastrar

2.Editar

3.Excluir

4.Sair

Use switch para exibir uma mensagem correspondente à opção escolhida. */

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero correspondente com as opções: + 1:Cadastrar; 2:Editar; 3:Excluir; 4:Sair. ");
    int opcao = scanner.nextInt();

    switch (opcao) {
      case 1: {
        System.out.println("Você entro na area de cadastro!");
        break;
      }
      case 2: {
        System.out.println("Você entrou na área de edição!");
        break;
      }
      case 3: {
        System.out.println("Ao selecionar essa opção, o item será excluido!");
        break;
      }
      case 4: {
        System.out.println("Você Saiu do programa!");
        break;
      }

      default:
        System.out.println("Opção nao listda!");
        break;
    }
    scanner.close();
  }
}
