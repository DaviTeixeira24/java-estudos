package swingdemo;

import javax.swing.JFrame; // JFrame é a classe utilizada para criar a interface grafica(GUI)
import javax.swing.JLabel; // JLabel é a classe utilizada para criar textos dentro da interface

public class FirstGUI {
  public static void main(String[] args) {

    GUI obj = new GUI(); // criando objeto da GUI(estanciado da classe JFrame)

  }
}

// realizar os comandos dentro do contruto
class GUI extends JFrame {

  public GUI() {

    setVisible(true);// por default o JFrame nao é visivel, então utilizamos de um metodo para deixar
                     // o objeto visivel
    setSize(400, 400); // aqui definimos o tamanho da interface;

    JLabel label = new JLabel("Ola Mundo!"); // criando o objeto de texto(geralmente chamado de label)
    add(label);// adicionando a label na interface
  }
}
