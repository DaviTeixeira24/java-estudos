package swingdemo;

import javax.swing.*;
import java.awt.*;

public class ExemploAdicaoGUI {
  public static void main(String[] args) {
    Adicao obj = new Adicao();
  }

}

class Adicao extends JFrame {

  public Adicao() {

    JTextField n1 = new JTextField(20); // entrada dos dados
    JTextField n2 = new JTextField(20);
    JButton button = new JButton("="); // boâo para executar a ação
    JLabel label = new JLabel("Resultado: ");// mostrar a saida dos dados
    JLabel soma = new JLabel("+");

    add(n1);
    add(soma);
    add(n2);
    add(button);
    add(label);

    setLayout(new FlowLayout());
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

}