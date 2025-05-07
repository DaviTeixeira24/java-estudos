/*Estrutura condicional composta... Diferente da simples ela efetua ambos os fluxos,
  tanto verdadeiro, quanto falso... 
    
  vimos que o fluxo verdadeiro é "representado" pelo "IF"
  o fluxo falso sera "representado" pelo "ELSE"
    
    dica:Para facilitar pense no if/else como "SE(if)" ou "SE NÂO(else)" exemplo:

    SE(for verdadeiro){
      /instrução a ser realizada caso a informação for Verdadeira/
    } SE NÃO{
       /instrução a ser realizada caso a informação for Falsa/
    }
    


  segue o exemplo abaixo:
*/

public class ResultadoEscolar {
  public static void main(String[] args) {

    double nota = 8;

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }

}
/*
 * dado esse exemplo... Refaça a classe "CaixaEletronica.java" usando Estrutura
 * Condicional Composta
 */