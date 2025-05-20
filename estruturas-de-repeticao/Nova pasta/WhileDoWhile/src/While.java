/* O laço de repetição "While"(enquanto) determina que "Enquanto"(while) uma condição for 
  válida, o bloco de código vai ser executadi. Ele sempre testa a condição antes de executar 
  o código, então, setver uma condição inválida o bloco nao será executado. 

  Sintaxe/Estrutura:

  while(expressão booleana de validação/true||false){
  
    *comando que será executado até que a expresao de validação torne-se falsa
  
  }
    

*/

/* Exemplo/Pratica: Joãozinho recebeu R$50,00 de mesada e doi em uma loja de doces 
gastar todo seu dinheiro, enquanto o valor dos doces nâo igualar a 
R$50,00 e foi adicinando itens ao carrinho.*/

import java.util.concurrent.ThreadLocalRandom;//classe para gerar valores aleatórios

public class While {
  public static void main(String[] args) {
    double mesada = 50.0;

    while (mesada > 0) {
      double valorDoce = valorAleatorio();
      // vamos fazer uma verificação para que a mesada nao fique com valor negativo,
      // ou seja, se o valor do ultimo doce ultrapassar o valor da mesada, o programa
      // ira ajustar o valor do doce para o valor restante da mesada (é como se
      // joaozinho
      // escolhesse um doce mais barato)

      if (valorDoce > mesada) {
        valorDoce = mesada;
      }

      System.out.println("Doce com valor: " + valorDoce + " Foi adicionado no carrino");
      mesada = mesada - valorDoce;

    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Acabou o dinheiro Joãozinho ;-;");

  }

  // criando um método privado para esta classe, que, irá retornar valores
  // aleatórios entre 2 e 8
  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
