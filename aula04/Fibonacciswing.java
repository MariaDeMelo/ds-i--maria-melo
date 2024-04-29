package aula04;
import javax.swing.*;

public class Fibonacciswing {
    public static void main(String[] args){
        int h=0;
        int j=0;
    
        for (int i = 1; i < 20;){
            String m =String.valueOf(j);
            String output =m+"    ";
            int j=Integer.parseInt(m);
            h=i;
            i=j;
            j=h+i;
    }
  }
}