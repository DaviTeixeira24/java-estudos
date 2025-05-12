/* A condição ternária é uma forma de resumir o seu código ou deixar ele mais limpo... 
Fazemos isso passando as condições atravez de outra variavel 

segue o exemplo abaixo:
*/

public class ResultadoEscolarTernario {
  public static void main(String[] args) {
    int notaAluno1 = 8;
    String resutado1 = notaAluno1 >= 7 ? "Aprovado" : "Reprovado";

    System.out.println("Aluno 1: " + resutado1);

    /* agora vamos juntar a condição ternária com encadeamento: */

    int notaAluno2 = 10;

    String resultado2 = notaAluno2 >= 7 ? "Aprovado"
        : notaAluno2 >= 5 && notaAluno2 < 7 ? "Realizar prova de recuperação" : "Reprovado";

    System.out.println("Aluno 2: " + resultado2);
  }
}
