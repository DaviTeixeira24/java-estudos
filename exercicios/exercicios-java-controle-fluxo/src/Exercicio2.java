/*Peça ao usuário sua idade e classifique-o da seguinte forma:

Menor que 13: "Criança"

Entre 13 e 17: "Adolescente"

Entre 18 e 59: "Adulto"

60 ou mais: "Idoso" */

import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual é a sua Idade");
    int idade = scanner.nextInt();

    if (idade < 13) {
      System.out.println("Você é uma Criança!");
    } else if (idade >= 13 && idade <= 17) {
      System.out.println("Você é apenas um Adolescente!");
    } else if (idade >= 18 && idade <= 59) {
      System.out.println("Você é um Adulto!");
    } else if (idade >= 60) {
      System.out.println("Voce é um Idoso!");
    }
    scanner.close();
  }
}
