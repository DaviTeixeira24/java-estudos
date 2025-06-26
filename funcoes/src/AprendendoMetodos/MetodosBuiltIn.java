package AprendendoMetodos;

public class MetodosBuiltIn {
  public static void main(String[] args) {
    // 10 - funcoes built in de string
    String frase = "Java é demais!";

    // length
    System.out.println(frase.length());

    // substring
    System.out.println(frase.substring(0, 4));

    // toUpperCase => deixar tudo em maiusculo
    // toLowercase => deixar tudo em minusculo
    System.out.println(frase.toUpperCase());
    System.out.println(frase.toLowerCase());

    // replace => troca caracteres
    System.out.println(frase.replace("a", "e"));

    // encapsulando...
    String fraseNova = frase.replace("e", "a");
    System.out.println(fraseNova);

  }
}
