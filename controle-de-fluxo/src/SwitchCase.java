/* "Switch case"... Compara o valor de caso("case") com o da variavel sequencialmente, 
sempre que encontra um valor corrspondente, executa o codigo passado dentro do caso("case").
  Porem isso pode se tornar um loop... e o codigo ficara comparando com cada caso e repitindo os mesmos no terminal,
  para evitar que isso aconteça utilizaremos o comando "break" no final de cada bloco de codigo.
    O comando "break" encerra a execução do bloco ou da estrutura de código onde ele se encontra

    Veja um exemplo abaixo:
  */

public class SwitchCase {
  public static void main(String[] args) {
    String valor = "G";

    switch (valor) {
      case "P": {
        System.out.println("Pequeno");
        break;
      }
      case "M": {
        System.out.println("Medio");
        break;
      }
      case "G": {
        System.out.println("Grande");
        break;
      }

      default: {
        System.out.println("Indefinido");
      }
    }

    /*
     * Se vc perceber... nesse exemplo é possivel usar o "else if" para a comparação
     * dos casos então ficara ao seu critério
     * qual dos dois você ira usar... Porem existem estruturas onde será mais viavel
     * usar apenas o "switch case" como você verá no exemplo abaixo
     * 
     * Exemplo(enunciado): Criar um sistema de prano Teçefonico onde:
     * 
     * O sistema terá 03 planos: BASIC(B), MIDIA(M), TURBO(T)
     * BASIC: 100 minutos de ligação
     * MIDIA: 100 minutos de ligação + Whatsapp e Instagram Grátis
     * TURBO: 100 minutos de ligação + Whatsapp e Instagram Grátis + 5gb Youtube
     */

    // vemos que nesse exemplo também é possivel utilizar o "else if" para a
    // comparação, porêm...

    String plano = "M"; // B ou T

    if (plano == "B") {
      System.out.println("100 minutos de ligação");
    } else if (plano == "M") {
      System.out.println("100 minutos de ligação");
      System.out.println("Whatsapp e Instagram Grátis");
    } else if (plano == "T") {
      System.out.println("100 minutos de ligação");
      System.out.println("Whatsapp e Instagram Grátis");
      System.out.println("5gb Youtube");
    }

    // Aqui vai funcionar... porêm nao é um boa prática de código.
    // Vamos ver como fica Utilizando o "Switch Case"

    String planoS = "T";

    switch (planoS) {
      case "T": {
        System.out.println("5gb Youtube");
      }
      case "M": {
        System.out.println("Whatsapp e Instagram Gratis");
      }
      case "B": {
        System.out.println("100 Minutos de ligação");
      }

    }

    // aqui nesse exemplo nao utilizaremos o "break" pois a condição exige uma
    // "continuidade" ...
  }

}
