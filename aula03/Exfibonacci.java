package aula03;

public class Exfibonacci{
  public static void main(String[] args){
      int j=0;//resultado
      int h=0;//ultimo resultado
      for (int i = 1; i < 20;){//penultimo resultado
        System.out.println(j);
          h=i;
          i=j;
          j=h+i;
          
      }
  }
}