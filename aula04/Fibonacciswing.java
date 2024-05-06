package aula04;
import javax.swing.*;
public class Fibonacciswing {
  public static void main(String[] args) {
      int h = 0;
      String j = "0";
      String m = j;
      String output = "Esta é a sequência de Fibonacci:\n";
      for (int i = 1; i < 20;) {
          output += m + "    ";
          int n = Integer.parseInt(m);
          h = i;
          i = n;
          n = h + i;
          m = String.valueOf(n);
      }
      JOptionPane.showMessageDialog(null, output);
  }
}