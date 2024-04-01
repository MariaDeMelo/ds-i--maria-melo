public class Metodos {
    static void meuMetodo(){
        System.out.println("Assim funciona um metodos");
    }
    //static-define que este metodo pertence a classe main e não é objeto
    //void-significa que o metodo não vai ter retorno
    static void meuMetodoComParametros(String nome,int idade){
        System.out.println(nome+" tem "+idade);
    }
    public static void main(String[] arg) {
        meuMetodo();
        meuMetodoComParametros("João" ,36);
        meuMetodoComParametros("Maria" ,16);
    }
}