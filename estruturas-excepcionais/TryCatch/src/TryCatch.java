/* Tratamento de exceçôes serve para lidar com possiveis erros no código de forma controlada. 
Usamos o "Try/Catch" para executar o código com possiveis erros, e caso eles aconteçam, 
capturar esse erros e registrar como corrigir eles, mostrando uma mensagem no terminal . */

/* 
No exemplo abaixo, o usuário pode cometer erros ao digitar sua altura ou idade, 
como inserir letras em vez de números, deixar o campo vazio ou usar um formato inválido. 

Para evitar que o programa trave por causa desses erros, vamos usar o tratamento de exceções. 
Assim, conseguimos capturar o erro e lidar com ele de forma controlada, 
mostrando uma mensagem apropriada ou solicitando uma nova entrada.
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
/*Classe que permite definir o padrão de localização (como idioma e formato de números)
  Usada junto com o Scanner para garantir que a leitura de dados (como números decimais) 
  siga o padrão de idioma escolhido (ex: ponto ou vírgula como separador decimal).*/

public class TryCatch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.println("Digite seu Sobrenome: ");
      String sobrenome = scanner.nextLine();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();

      // imprimindo os dados

      System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "m ");
    } catch (InputMismatchException e) {
      System.out.println("Digite os numeros de forma correta!");
    }

    scanner.close();

  }
}
