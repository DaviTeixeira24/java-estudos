/*Desconto em Produto
Peça o valor de um produto e a categoria (1, 2 ou 3).
Use switch para aplicar os seguintes descontos:

Categoria 1: 10%

Categoria 2: 20%

Categoria 3: 30%

 */

import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a categoria do produto: ");
    int categoria = scanner.nextInt();

    System.out.println("Digite o preço do produto: ");
    double valorProduto = scanner.nextDouble();

    switch (categoria) {
      case 1: {
        double percDesconto = 10; // percentual do desconto
        double desconto = valorProduto * (percDesconto / 100);
        double valorFinal = valorProduto - desconto;
        System.out.println("Valor final é: " + valorFinal);
        break;
      }
      case 2: {
        double percDesconto = 20;
        double desconto = valorProduto * (percDesconto / 100);
        double valorFinal = valorProduto - desconto;
        System.out.println("Valor final é: " + valorFinal);
        break;
      }
      case 3: {
        double percDesconto = 30;
        double desconto = valorProduto * (percDesconto / 100);
        double valorFinal = valorProduto - desconto;
        System.out.println("Valor final é: " + valorFinal);
        break;
      }
      default:
        System.out.println("Categoria nao registrada!");
        break;
    }

    scanner.close();

  }

}
