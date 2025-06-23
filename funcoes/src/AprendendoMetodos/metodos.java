package AprendendoMetodos;

public class metodos {
  public static void main(String[] args) {

    saudacao(); // chamando o método para ser executado

    // 2 - parâmetros
    soma(10, 20);

    // 3 - return

    int numeroDobrado = dobrar(20); // para mostrar no terminal, atribua essa função para variavel e imprima a mesma
    System.out.println(numeroDobrado);
  }

  // criando método
  // NIVEL DE ACESSO, STATIC => não preciso instanciar classe para executar, TIPO
  // DE RETORNO
  // NOME, ARGUMENTOS => (), BLOCO => {}

  public static void saudacao() {
    System.out.println("Ola, Meu primeiro método");
  }

  public static void soma(int a, int b) {
    int resultado = a + b;
    System.out.println(resultado);
  }

  public static void saudar(String nome) {
    System.out.println("Ola " + nome + " Seja bem vindo!");

  }

  public static int dobrar(int num) {
    return num * 2;
  }

}
