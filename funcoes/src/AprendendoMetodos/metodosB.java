package AprendendoMetodos;

public class metodosB {

  // Escopo global(de classe)
  static int globalVar = 20;
  /*
   * usamos o static para que a variavel possa ser usada independente se a classe
   * for instanciada não(assim como nos métodos||funções)
   */

  public static void main(String[] args) {

    // 5 - funçoes com condicionais
    String r1 = verificarAcesso(15, false, true);
    System.out.println(r1);

    // 6 -funções com switch

    String r2 = diaSemana(2);
    System.out.println(r2);

    // 7 - System Exit
    verificarAutenticacao("admin", "SenhaSegura");
    System.out.println("Oi");

    // 8 - Documentação função
    System.out.println(calcularMedia(5, 10, 11));

    // 9 - Escopo => contexto em que uma variavel ou método é acessivel em um
    // programa, basicamente define onde você pode usar uma vriavel ou método

    // escopo local(de método||função)
    int localVar = 10;
    System.out.println(localVar);

    if (localVar == 10) {
      int soma // escopo de bloco
          = 10 + localVar;
      System.out.println(soma);
    }

    System.out.println(globalVar); // pode ser acessada em qualquer lugar do código pertencente a classe
    exemploEscopo(); // fixiando o exemplo acima!

    // { } => abertura e fechamento de chaves delimitam um escopo, criam um escopo

  }

  public static String verificarAcesso(
      int idade,
      boolean temCarteira,
      boolean temHistoricoNegativo) {

    if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
      return "Acesso permitido todos os critérios atendidos! Aceleraa!";
    } else {
      return "Acesso negado! alguns critérios nao correspondem";
    }
  }

  public static String diaSemana(int dia) {

    // return ja funciona como um break
    switch (dia) {
      case 1:
        return "Segunda-Feira";
      case 2:
        return "Terça-Feira";
      case 3:
        return "Quarta-Feira";
      case 4:
        return "Quinta-Feira";
      case 5:
        return "Sexta-Feira";
      case 6:
        return "Sábado";
      case 7:
        return "Domingo";

      default:
        return "Dia inválido";
    }
  }

  public static void verificarAutenticacao(String usuario, String senha) {
    if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
      System.out.println("Autenticação falhou!");
      System.exit(1);
    }
    System.out.println("Autenticação bem sucedida!");
  }

  /**
   * Calcula a média de três números inteiros
   * 
   * @param num1  O primeiro numero a ser enviado
   * @param num2o O segundo numero a ser enviado
   * @param num3o O terceiro numero a ser enviado
   * @return A média dos três numeros
   */
  public static double calcularMedia(int num1, int num2, int num3) {
    return (num1 + num2 + num3) / 3;
  }

  public static void exemploEscopo() {
    System.out.println(globalVar);
  }
}
