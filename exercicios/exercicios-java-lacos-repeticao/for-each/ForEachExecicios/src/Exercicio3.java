/*Lista de nomes em maiúsculas
Crie um array de nomes (Strings) e 
use for-each para imprimir cada nome em letras maiúsculas. */

public class Exercicio3 {
  public static void main(String[] args) {
    String nomes[] = { "DAVI", "LUCAS", "FELIPE", "GABRIEL", "JUNIOR", "CLAUDIO" };

    for (String nome : nomes) {
      String nomesMin = nome.toLowerCase();
      System.out.println(nomesMin);
    }

  }
}
