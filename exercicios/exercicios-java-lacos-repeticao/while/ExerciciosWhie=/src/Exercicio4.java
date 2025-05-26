
import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite as notas (de 0 a 10) dos alunos. Digite -1 para encerrar ");

    double nota = 0;
    double soma = 0;
    int quantidade = 0;

    while (nota != -1) {

      System.out.println("Nota: ");
      nota = scanner.nextDouble();

      if (nota >= 0 && nota <= 10) {
        soma += nota;
        quantidade++;
      } else if (nota < 0 && nota != -1) {
        System.out.println("Nota inválida");
      }

    }

    if (quantidade > 0) { // verificar se a quantidade das notas é maior que zero
      double media = (soma / quantidade);
      System.out.println("A média da turma é: " + media);
    } else {
      System.out.println("Nenhuma nota válida foi inserida.");
    }

    scanner.close();
  }
}
