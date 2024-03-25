package aula01;

import java.util.Scanner;

public class Exercicio{
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        double peso;
        double cm;
        String nome;
        String classificacao;

        System.out.println("Qual é o seu nome?");
        nome = Myobj.nextLine();


        System.out.println("Qual é o seu peso?");
        peso = Myobj.nextInt();

        System.out.println("Qual é a sua altura em centimetro?");
        cm = Myobj.nextDouble();
        
        double altura = cm/100;

        double imc = peso/(altura*altura);

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
        System.out.println(nome + " tem "+ altura + " de altura e pesa " + peso + " kg.o seu IMC é " + imc + ".Sua situação é "+classificacao );
    }
}