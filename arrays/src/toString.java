import java.util.*;;

public class toString {
  public static void main(String[] args) {
    int[] numeros = { 1, 2, 3, 4, 5, 6 };
    String[] frutas = { "Banana", "Melão", "Manga", "Melancia", "Morango" };

    // mostrando dados de um array(int) com toString
    String dadosNumericos = Arrays.toString(numeros);
    System.out.println(dadosNumericos);

    // mostrando dados de um array(String) com toString
    String dadosFrutas = Arrays.toString(frutas);
    System.out.println(dadosFrutas);

    // mostrando dados de um array vazio...
    int[] vazio = new int[5];
    System.out.println(Arrays.toString(vazio)); // comando usado unicamente para tratamento de erros e ver os dado de um
                                                // array

  }
}
