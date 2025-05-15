
/* Calculadora Simples com switch
Peça dois números e um operador (+, -, *, /) e use switch para realizar a operação matemática.
*/
import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o operador que esta entre os Listados as seguir: (+,-,*,/) ");
    String operador = scanner.nextLine();

    System.out.println("Digite o 1º número:");
    int numero1 = scanner.nextInt();

    System.out.println("digite o 2º número");
    int numero2 = scanner.nextInt();

    int soma = numero1 + numero2;
    int subtracao = numero1 - numero2;
    int multiplicacao = numero1 * numero2;
    double divisao = (double) numero1 / numero2;

    switch (operador) {
      case "+": {
        System.out.println("O resultado da soma é: " + soma);
        break;
      }
      case "-": {
        System.out.println("O resultado da subtração é: " + subtracao);
        break;
      }
      case "*": {
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        break;
      }
      case "/": {
        System.out.println("O resultado da divisão é: " + divisao);
        break;
      }

      default:
        System.out.println("Operador não listado");
        break;
    }
    scanner.close();
  }
}
