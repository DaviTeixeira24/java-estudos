/* Implemente um jogo onde o 
computador escolhe um número aleatório de 1 a 50 e o 
jogador precisa adivinhar. Use while para repetir até o jogador acertar.*/

import java.util.Scanner;
import java.util.Random;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    /*
     * Jeito que eu fiz(errado)
     * int numeroA = random.nextInt(10) + 1;
     * 
     * System.out.println("Digite um numero entre 1 e 10: ");
     * int palpite = scanner.nextInt();
     * 
     * 
     * 
     * while (palpite != numeroA) {
     * 
     * if (palpite == numeroA) {
     * System.out.println("Parabens! Voce Acertou.");
     * } else {
     * System.out.println("Errou! Tente novamente");
     * }
     * break;
     * }
     */

    // corrigido e correto
    int numeroA = random.nextInt(50) + 1;

    int palpite = 0; // obs: inicializa o palpite fora do laço

    while (palpite != numeroA) {
      System.out.print("Digite um número entre 1 e 50: ");
      palpite = scanner.nextInt(); // Lê o palpite do jogador

      if (palpite < numeroA) {
        System.out.println("Muito baixo! Tente novamente.");
      } else if (palpite > numeroA) {
        System.out.println("Muito alto! Tente novamente.");
      }
    }

    // obs: quando vc acertar, sairá do laço...
    System.out.println("Parabéns! Você acertou. O número era " + numeroA + "!");

    scanner.close();
  }

}
