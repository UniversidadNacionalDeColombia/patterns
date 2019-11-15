import java.util.Scanner;

//Se crea la bebida que extiende los atributos y metodos
public class Latte extends Beverage {

    int precio = 0;

    //El constructor llama a super para inicializar lo del padre.
    public Latte() {
        super();
    }

    //Los setters y getters de la Clase.

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /*
        Esta funcion de costo va a inizializar el costo base de la bebida
        y va a llamar a la funcion extra_ingredients con el costo base
        para determinar el costo final de la bebida.
     */

    public void cost(){
        this.setNombre("Latte");
        this.setPrecio(25);
        System.out.println("El valor base del "+this.getNombre()+" es de "+this.getPrecio()+"$");
        System.out.println("Desea su "+this.getNombre()+" con ingredientes extra? (Si/No): ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        switch(inputString) {
            case "Si":
                System.out.println("El costo total de su bebida es de "+this.extra_ingredients(this.getPrecio()) + "$");
                break;
            case "No":
                System.out.println("El costo total de su bebida es de "+this.getPrecio()+"$");
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
    }
}