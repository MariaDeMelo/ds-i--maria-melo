//package aula02;

import java.util.Scanner;

public class Expal {
    String Pal1;
    String Pal2;

    public void EscolhaPalavras() {
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("escolha uma palavra:");
        Pal1= Scan.nextLine();

        System.out.println("escolha uma palavra:");
        Pal2= Scan.nextLine();
    }
    public void TrueOrFalse(){
        EscolhaPalavras();
        if (Pal1.equals(Pal2)){
           System.out.println("as palavras escolhidas que são "+Pal1+" e "+Pal2+" são iguais");
        }else {
            System.out.println("as palavras escolhidas que são "+Pal1+" e "+Pal2+" são diferentes");
        }
    } 
    public static void main(String[] args) {
        Expal expal = new Expal();
        expal.TrueOrFalse();
    }
}
