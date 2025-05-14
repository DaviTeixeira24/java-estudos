/*
 Peça a nota de um aluno (0 a 100). Classifique:

A (90 a 100)

B (80 a 89)

C (70 a 79)

D (60 a 69)

F (menor que 60)
 */

import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a nota do Aluno: ");
    int notaAl = scanner.nextInt();

    if (notaAl >= 90 && notaAl <= 100) {
      System.out.println("Incrivel!! Você tirou um (A)!");
    } else if (notaAl >= 80 && notaAl <= 89) {
      System.out.println("Muito Bom! Você tirou um (B)!");
    } else if (notaAl >= 70 && notaAl <= 79) {
      System.out.println("Bom! Você tirou um (C)!");
    } else if (notaAl >= 60 && notaAl <= 69) {
      System.out.println("É, da pra melhorar! Você tirou um (D)!");
    } else if (notaAl <= 60 && notaAl >= 0) {
      System.out.println("Ruim!! você tirou um (F)!!!");
    } else {
      System.out.println("Professor! o maximo de nota é 100! e o minimo é 0!");
    }
  }
}
