package AprendendoMetodos;

public class metodosB {
  public static void main(String[] args) {

    // 5 - funçoes com condicionais
    String r1 = verificarAcesso(15, false, true);
    System.out.println(r1);

    // 6 -funções com switch

    String r2 = diaSemana(2);
    System.out.println(r2);

    // 7 - System Exit
    verificarAutenticacao("asas", "Sen haSegura");

    System.out.println("Oi");

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
}
