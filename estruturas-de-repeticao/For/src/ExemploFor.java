/* Laços de repetição(loops) é uma estrutura condicional que permite  que comandos 
 presentes nos blocos sejam repetidos diversas vezes.
*/

/* For:  permite que uma variavel contadora seja testada e incrementada a cada repetição, 
as informações são definidas na chamada do comando "()"

 */

public class ExemploFor {
  public static void main(String[] args) {
    for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
      System.out.println("Contando carneirinhos: " + carneirinhos);
    }
    System.out.println("Joaozinho dormiu ZzZz");
  }
}
