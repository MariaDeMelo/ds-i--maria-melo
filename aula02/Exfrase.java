package aula02;

import java.util.Scanner;

public class Exfrase {
    String Frase;
    String PalavraFinal;

    public void EscolhaFrase() {
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Digite uma frase");
        Frase = Scan.nextLine();

        String[] palavras = Frase.split(" ");
        String ContemPalavra = palavras[palavras.length - 1];

        System.out.println("Na sua frase escolhida que foi '"+ Frase +" '" );
        System.out.println("contem a palavra'"+ ContemPalavra +" '" );
    }
    public static void main(String[] args) {
        Exfrase exfrase = new Exfrase();
        exfrase.EscolhaFrase();
    }
}

