/* Soma de Números Pares
Crie um programa que use for para somar todos os números 
 pares de 1 a 100 e exiba o resultado final.*/

public class Exercicio2 {
  public static void main(String[] args) {

    int soma = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        soma += i; // abreviação de "soma = i + i"
      }

    }
    System.out.println("Soma dos numeros pares: " + soma);
  }

}
