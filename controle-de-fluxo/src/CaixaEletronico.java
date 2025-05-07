/* Estrutura condicional simples se baseia em verdadeiro e falso assim como a maioria... porêm
  consegue apenas realizar uma opreação de fluxo, que nao pemite a transição de um fluxo para
  o outro. por exemplo:

   if(condição) {
    /Instrução a ser realizada/
  }
  /escopo da opreação/

  vemos que não poderiamos usar um "else" pois por ser simples nao permite a transição...

*/

//RETIRANDO DINHEIRO DO CAIXA

public class CaixaEletronico {
  public static void main(String[] args) {

    double saldo = 25.0;
    double valorSolicitado = 17.5;

    if (valorSolicitado < saldo) // condição para saber SE(if) valor solicitado é menor que o saldo
      saldo = saldo - valorSolicitado; // se for menor que o saldo o programa ira realizar a operação

    System.out.println(saldo);

    /*
     * fluxo simples... caso tente realizar a operação com o "valorSolicitado" maior
     * que o saldo
     * ele vai entendo como falso e nao irá realizar a operação... o valor atribuido
     * a vairavel "saldo"
     * nao irá mudar.
     * E isso reforça a explicação lá em cima... ele apenas consegue realizar o
     * fluxo verdadeiro e nao consegue realizar o falso...
     * 
     */
  }
}
