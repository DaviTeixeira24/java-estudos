/* Peça ao usuário para digitar um número inteiro. 
    Use if/else para verificar se o número é par ou ímpar e exiba a mensagem correspondente.
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero Par!");
        } else {
            System.out.println("Numero Impar!");
        }
        scanner.close();
    }
}
