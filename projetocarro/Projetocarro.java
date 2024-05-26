//eu não entendi muito bem a lição de casa, mas eu tentei fazer
//acessorio/tem de um carro - roda,porta,volante,buzina,luzes,cadeiras,vidro.
//aões de um carro-andar,aumentar ou diminuir a velocidade,buzinar,rodar,acender luzer.
package projetocarro;

import java.util.Scanner;

public class Projetocarro {
    double aumentarVel;
    double diminuirVel;
    int marcha;
    boolean buzinar;
    String buzina;
    int inicial = 50;
    String escolha;

    public void carro() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("O carro esta a 50km/h, não esta buzinando e a marcha é 5\n\n\nA-aumentar a velocidade\nB-freiar\nC-buzinar");
        escolha = Scan.nextLine();
    }

    public void funcionamentoCarro() {
        carro();
        if (escolha.equalsIgnoreCase("a")) {
            inicial = inicial + 10;
            marcha = inicial / 10;
            buzinar = false;
        } else if (escolha.equalsIgnoreCase("b")) {
            inicial = inicial - 10;
            marcha = inicial / 10;
            buzinar = false;
        } else if (escolha.equalsIgnoreCase("c")) {
            marcha = 5;
            buzinar = true;
        }
        if (buzinar) {
            buzina = "VAI";
        } else {
            buzina = "NÃO";
        }
    }

    public static void main(String[] args) {
        Projetocarro carrinho = new Projetocarro();
        carrinho.funcionamentoCarro();
        System.out.println("O carro esta a " + carrinho.inicial + "km/h, " + carrinho.buzina + " buzinando e a marcha é " + carrinho.marcha);
    }
}