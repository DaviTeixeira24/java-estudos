/* Break e Continue: "Break" significa parar/interromper o laço de reptição por completo. 
já o "Continue" interrompe somente oque foi definido e após isso, o laço continua!*/

//nesse exemplo queremos que o codigo pule os numeros impares e imprima apenas os numero pares
public class ExemploBreakContinue {
  public static void main(String[] args) {
    for (int numero = 1; numero <= 100; numero++) {
      if (numero % 2 != 0) {
        continue;
      }
      System.out.println(numero);
    }
  }
}
