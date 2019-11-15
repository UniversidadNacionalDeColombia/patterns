import java.util.Scanner;

public class Main {

    // esta es la funcion principal donde se podra escojer la bebida
    public static void main(String[] args) {
        System.out.println("Bienvenido a Juan Valdez");
        System.out.println("tenemos los siguientes tipos de bebidas");
        System.out.println("1: Simple Coffee");
        System.out.println("2: Expresso");
        System.out.println("3: Latte");
        System.out.print("Ingrese la bebida que desea: ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        //Dependiendo de lo que ingrese el usuario se crea un tipo de bebida.
        switch(inputString) {
            case "1":
                Simple_Coffee Simple_Coffee = new Simple_Coffee();
                Simple_Coffee.cost();
                break;
            case "2":
                Expresso Expresso = new Expresso();
                Expresso.cost();
                break;
            case "3":
                Latte Latte = new Latte();
                Latte.cost();
                break;
            default:
                System.out.println("No ingreso una bebida valida");
                break;
        }
    }
}
