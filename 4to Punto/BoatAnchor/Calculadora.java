import java.util.Scanner;

public class Calculadora  extends  Calculadoras_Father{

    //Esta atributo nunca se ulitiza en el objeto.
    private int parm = 0;

    //Este constructor es un caso de anchor boat ya que es un constructor que solo llama a una herencia de un padre que nunca utiliza.
    public Calculadora(String marca) {
        super(marca);
    }

    public void suma(){
        System.out.println();
        System.out.print("Ingrese un Numero: ");
        Scanner scanner = new Scanner(System. in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese otro Numero: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(x + y);
    }

    public void resta(){
        System.out.print("Ingrese un Numero: ");
        Scanner scanner = new Scanner(System. in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese otro Numero: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(x - y);
    }

    //Estos dos metodos son un caso de Anchor boat ya que Nunca se utilizan en la aplicacion.

    public void multiplicacion(){
        System.out.println();
        System.out.print("Ingrese un Numero: ");
        Scanner scanner = new Scanner(System. in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese otro Numero: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(x - y);
    }

    public void division(){
        System.out.println();
        System.out.print("Ingrese un Numero: ");
        Scanner scanner = new Scanner(System. in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese otro Numero: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(x - y);
    }
}
