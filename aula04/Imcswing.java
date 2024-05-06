package aula04;
import javax.swing.*;
public class Imcswing {
    public static void main(String[]args){
        String name =JOptionPane.showInputDialog("Qual é o seu nome");
        String peso=JOptionPane.showInputDialog("Qual é o seu peso");
        String cm=JOptionPane.showInputDialog("Qual é a sua altura");
        String classificacao;
        double altura = Double.parseDouble(cm);
        double ps = Double.parseDouble(peso);

        double alt = altura/100;
        double imc = ps/(alt*alt);

        if (imc < 16.9){
            classificacao = "MUITO ABAIXO DO PESO";
        }else if(imc < 18.4){
            classificacao = "ABAIXO DO PESO";
        }else if(imc < 24.9){
            classificacao = "PESO NORMAL";
        }else if(imc < 29.9){
            classificacao = "ACIMA DO PESO";
        }else if(imc < 34.9){
            classificacao = "OBESIDADE GRAU I";
        }else if(imc < 40.0){
            classificacao = "OBESIDADE GRAU II";
        }else{
            classificacao = "OBESIDADE GRAU III";
        }

        String imc2= new Double(imc).toString();
        String output =" prazer em te conhecer "+ name+" seu imc é "+imc2+" ,voce está "+classificacao;
        JOptionPane.showConfirmDialog(null, output);
    }
}
