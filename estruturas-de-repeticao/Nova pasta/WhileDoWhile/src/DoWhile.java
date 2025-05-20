/* O "Do While"(faça enquanto) é basicamente o mesmo que o "while", 
a diferença é que o "do while" testa a condição após a execução do codigo, sendo assim
 mesmo que a condição seja inválidano primeiro teste o bloco será executado pelo menos um vez
 Sintaxe/estrutura:
 
  do{
  
      *comando que será executado até que a expressão de validação torne-se falsa

  }
  while(expressão booleana de validação)

 */

/* Exemplo/Pratica: 
Joãozinho resolveu ligar para o seu amio dizendo que hoje comeu muitos doces */

import java.util.Random; //classe para gerar numeros(int) aleatorios

public class DoWhile {
  public static void main(String[] args) {
    System.out.println("Discando...");

    do {

      System.out.println("Telefone tocando");

    } while (tocando());

    System.out.println("Alô!!!");

  }

  // metodo para determinar quando o telefone esta tocando e quando nao está
  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);

    // return para quando o telefone for atendido parar de tocar.
    return !atendeu;
  }
}
