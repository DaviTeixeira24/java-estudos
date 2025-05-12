/* Estruturas Condicionais Encadeadas,são executadas assim como as compostas... 
porem nao se limitao a apenas dois usos(if/else) mas sim é utilizada quantas vezes for necessário, porem as condições continuam sendo verdadeiras ou falsas.
 Para esses tipod de cendição usaremos o "else if" que é nada mais, nada menos que um "mediador" ou "meio termo"...

veja o exemplo abaixo onde adicionamos a condição de "recuperação":
*/

public class ResultadoEscolarEncadeamento {
  public static void main(String[] args) {

    double nota = 10;

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 5 && nota < 7) {
      System.out.println("Realizar a prova de recuperação!!");
    } else {
      System.out.println("Reprovado");
    }
  }

}
