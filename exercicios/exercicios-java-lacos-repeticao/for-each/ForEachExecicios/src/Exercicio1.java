/* Dado um array de Strings com nomes de produtos, use for-each para 
imprimir cada item da lista precedido da palavra "Produto:".*/

public class Exercicio1 {
  public static void main(String[] args) {

    String produtos[] = { "ARROZ", "FEIJAO", "MACARRAO", "LEITE", "FARINHA" };

    for (String produto : produtos) {
      System.out.println("Produto: " + produto);
    }
  }
}
