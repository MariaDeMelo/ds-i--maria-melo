package aula04;
import javax.swing.*;
public class Swing{
    public static void main(String[]args){
        String name =JOptionPane.showInputDialog("Qual é o seu nome");
        String output =name +" que nome legal";
        JOptionPane.showConfirmDialog(null, output);
    }
}