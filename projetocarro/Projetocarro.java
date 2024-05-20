package projetocarro;

import java.util.Scanner;

public class Projetocarro {
    double aumentarVel;
    double diminuirVel;
    int marcha;
    boolean buzinar;
    String buzina;
    double inicial=50;
    String escolha;

    public void Carro() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("O carro esta a 50km/h ,não esta buzinando e a marcha e 5\n\nA-aumentar a velocidade\nB-freiar\nC-buzinar\nD-marcha");
        escolha= Scan.nextLine();
    }
    public void TrueOrFalse(){
        Carro();
        if (escolha=="a"){
            inicial=inicial+10;
            marcha=inicial%10;
        }else if(escolha=="b"){
            inicial=inicial-10;
            marcha=inicial%10;
        }else {
            inicial=inicial;
            marcha=5;
            buzinar=false;
        }

    } 
    public static void main(String[] args) {
        Projetocarro expal = new Projetocarro();
        expal.Carro();
    }
}
