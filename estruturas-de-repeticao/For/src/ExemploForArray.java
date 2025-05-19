/* Tambem podemos usar "for" em "arrays"...  geralmente é muito utilizado. */

public class ExemploForArray {

  public static void main(String[] args) {

    // em arrays o indice se inicia em 0
    String alunos[] = { "DAVI", "ANDRÉ", "RAPHAEL", "GABRIEL" }; // criando array

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno do indice i= " + i + " é " + alunos[i]);
    }
  }
}
