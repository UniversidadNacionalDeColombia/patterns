//La siguente es una pequeña aplicacion de calculadora la cual va a presenatar varios casos de Boat Anchor

public class Main {
    // esta es la funcion principal donde se ejecutara la aplicacion
    public static void main(String[] args) {
        //Aqui hay un caso de Boat Anchor ya que se crean variables que nunca se utilizan
        int x = 10;
        int y = 10;
        //Aqui hay un caso de Boat Anchor ya que se crea un objeto que nunca se utiliza
        CalculadoraOffset CalculadoraOffset = new CalculadoraOffset();
        System.out.println("Bienvenido a La super Calculadora");
        Calculadora calculadora = new Calculadora("Epson");
        System.out.println("Vamos a realizar una Suma");
        calculadora.suma();
        System.out.println("Vamos a realizar una Resta");
        calculadora.resta();

    }
}