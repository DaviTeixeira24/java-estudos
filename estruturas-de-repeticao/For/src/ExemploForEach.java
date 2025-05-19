/* o uso do "for/each" é relacionado com o cenario que contenha arrays/coleção, sendo assim, 
a interação é baseada nos elementos que pertencem ao array/coleção*/

public class ExemploForEach {
  public static void main(String[] args) {
    String alunos[] = { "DAVI", "ANDRÉ", "RAPHAEL", "GABRIEL" }; // recriando array

    for (String aluno : alunos) {
      /*
       * ":" significa que a cada interação de alunos, o aluno do indice atual vai
       * atualizar a variavel.
       */
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
