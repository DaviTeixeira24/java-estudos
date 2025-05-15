
/* Solicite três números inteiros ao usuário e determine qual deles é o maior. */
import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o 1º numero:");
    int numero1 = scanner.nextInt();
    System.out.println("Digite o 2º numero:");
    int numero2 = scanner.nextInt();
    System.out.println("Digite o 3º numero:");
    int numero3 = scanner.nextInt();

    if (numero1 > numero2 && numero1 > numero3) {
      System.out.println("Maior numero é: " + numero1);
    } else if (numero2 > numero3 && numero2 > numero1) {
      System.out.println("Maior numero é: " + numero2);
    } else if (numero3 > numero2 && numero3 > numero1) {
      System.out.println("Maior numero é: " + numero3);
    }
    scanner.close();
  }
}
