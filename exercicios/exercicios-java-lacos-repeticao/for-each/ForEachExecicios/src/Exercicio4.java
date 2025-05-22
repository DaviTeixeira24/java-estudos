/*Dado um array de inteiros, use for-each para 
contar quantos números são maiores que 10 e exiba o total no final. */

public class Exercicio4 {
  public static void main(String[] args) {
    int numeros[] = { 10, 9, 5, 79, 65, 50, 8, 54, 78, 11, 7, 3 };

    int soma = 0;

    for (int numero : numeros) {
      if (numero > 10) {
        soma++;
      }
    }
    System.out.println(soma);

  }
}
