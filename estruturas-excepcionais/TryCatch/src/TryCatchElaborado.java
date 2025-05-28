
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatchElaborado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    String nome = lerNome(scanner);
    String sobrenome = lerSobreNome(scanner);
    int idade = lerIdade(scanner);
    double altura = lerAltura(scanner);

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "m ");

  }

  public static String lerNome(Scanner scanner) {
    String nome = "";

    do {
      System.out.println("Digite seu nome: ");
      nome = scanner.nextLine();
      if (nome.trim().isEmpty()) {
        System.out.println("Preencha o campo vazio!");
      }
    } while (nome.trim().isEmpty());

    return nome;
  }

  public static String lerSobreNome(Scanner scanner) {
    String sobrenome = "";

    do {
      System.out.println("Digite seu sobrenome: ");
      sobrenome = scanner.nextLine();

      if (sobrenome.trim().isEmpty()) {
        System.out.println("Não deixe o campo vazio!");
      }

    } while (sobrenome.trim().isEmpty());
    return sobrenome;
  }

  public static int lerIdade(Scanner scanner) {
    int idade = 0;
    boolean entradaValida;
    do {
      try {
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        entradaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Erro: Digite um numero inteiro: ");
        scanner.nextLine();
        entradaValida = false;
      }
    } while (!entradaValida);

    return idade;
  }

  public static double lerAltura(Scanner scanner) {
    double altura = 0.0;
    boolean entradaValida;

    do {
      try {
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        entradaValida = true;// trocando validador para true quando a leitura der certo
      } catch (InputMismatchException e) {
        System.out.println("Erro: Digite a altura de forma correta(ex: 1.88)");
        scanner.nextLine();
        entradaValida = false;
      }

    } while (!entradaValida);

    return altura;
  }

}
