package AprendendoMetodos;

public class metodos {
  public static void main(String[] args) {

    saudacao(); // chamando o método para ser executado

    // 2 - parâmetros
    soma(10, 20);

    // 3 - return

    int numeroDobrado = dobrar(20); // para mostrar no terminal, atribua essa função para variavel e imprima a mesma
    System.out.println(numeroDobrado);

    // 4 - retorno em variavel(encapsulamento)

    int num = 25;

    String r1 = verificarPar(12);
    String r2 = verificarPar(num);

    System.out.println(r1);
    System.out.println(r2);

    /*
     * encapsulamos o retorno de uma função(método) em outra, e depois encapsulamoso
     * resultado em uma variavel
     */
    int x = dobrar(somar2(10, 10));
    System.out.println("A dobra a soma dos numeros é: " + x);

    //

  }

  // criando método
  // NIVEL DE ACESSO => ex: PUBLIC || PRIVATE , STATIC => não preciso instanciar
  // classe para executar, TIPO
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

  // parametros de metodos(funções) diferentes, podem ter o mesmo nome
  public static int dobrar(int num) {
    return num * 2;
  }

  public static String verificarPar(int num) {
    if (num % 2 == 0) {
      return "O numero " + num + " é par!";
    } else {
      return "O numero " + num + " não é par!";
    }

  }

  public static int somar2(int a, int b) {
    return a + b;
  }

}
