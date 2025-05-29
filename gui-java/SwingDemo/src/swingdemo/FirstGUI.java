package swingdemo;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;

public class FirstGUI {
  public static void main(String[] args) {

    GUI obj = new GUI(); // criando objeto da GUI(estanciado da classe JFrame)

  }
}

// realizar os comandos dentro do construtor
class GUI extends JFrame {

  public GUI() {

    JLabel label = new JLabel("Ola Mundo!"); // criando um componente de texto(geralmente chamado de label)
    JLabel label2 = new JLabel("Minha Primeira GUI!");

    add(label);// adicionando a label na interface
    add(label2);

    // comandos essenciais para funcionamento da GUI
    setLayout(new FlowLayout());
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
