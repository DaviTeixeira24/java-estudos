/*Dado um array de doubles representando notas de alunos, 
use for-each para somar as notas e depois calcule a média.*/

public class Exercicio2 {

  public static void main(String[] args) {
    double notas[] = { 8.7, 10, 5.5, 7.5, 6.5, 9, };
    double soma = 0;

    for (double nota : notas) {
      soma += nota;
    }

    double media = (soma / notas.length);
    System.out.println("A média da turma é: " + media);

  }
}
