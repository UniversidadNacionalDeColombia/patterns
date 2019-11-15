import java.util.Scanner;

//Esta va a ser la clase padre de la que van a heredar las bebidas de la tienda.
public class Beverage {
    // Los atributos de la bebida.
    String nombre;
    boolean leche;
    boolean tiempo_cocion;
    boolean mocha;
    boolean figura_de_portada;

    //Los setters y getters de la Clase.

    public boolean isLeche() {
        return leche;
    }

    public void setLeche(boolean leche) {
        this.leche = leche;
    }

    public boolean isTiempo_cocion() {
        return tiempo_cocion;
    }

    public void setTiempo_cocion(boolean tiempo_cocion) {
        this.tiempo_cocion = tiempo_cocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isFigura_de_portada() {
        return figura_de_portada;
    }

    public void setFigura_de_portada(boolean figura_de_portada) {
        this.figura_de_portada = figura_de_portada;
    }


    /*
       Esta funcion va a recibir el precio base de la bebida y le va a solicitar
       al usuario si desea ingredientes extra y con base en lo que el usuario escoja
       Se calcula el precio.
    */
    public int extra_ingredients(int base_price){

        int precio = base_price;

        System.out.println("Ingredientes Extra:");
        System.out.println("-Leche - 6$");
        System.out.println("-Tiempo de Coccion mayor a 2 minutos - 4$");
        System.out.println("-Con Mocha - 10$");
        System.out.println("-Con figura de portada - 7$");
        System.out.println("Desea su "+ getNombre() +" con leche? (Si/No): ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        switch(inputString) {
            case "Si":
                this.setLeche(true);
                break;
            case "No":
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        System.out.println("Desea su "+ getNombre() +" con Tiempo de Coccion mayor a 2 minutos? (Si/No): ");
        Scanner scanner2 = new Scanner(System. in);
        String inputString2 = scanner2. nextLine();
        switch(inputString2) {
            case "Si":
                this.setTiempo_cocion(true);
                break;
            case "No":
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        System.out.println("Desea su "+ getNombre() +" con Mocha? (Si/No): ");
        Scanner scanner3 = new Scanner(System. in);
        String inputString3 = scanner3. nextLine();
        switch(inputString3) {
            case "Si":
                this.setMocha(true);
                break;
            case "No":
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        System.out.println("Desea su "+ getNombre() +" con Figura de portada? (Si/No): ");
        Scanner scanner4 = new Scanner(System. in);
        String inputString4 = scanner4. nextLine();
        switch(inputString4) {
            case "Si":
                this.setFigura_de_portada(true);
                break;
            case "No":
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        };

        if(this.isLeche()){
            precio+=6;
        };
        if(this.isTiempo_cocion()){
            precio+=4;
        };
        if(this.isMocha()){
            precio+=10;
        };
        if(this.isFigura_de_portada()){
            precio+=7;
        };
        return precio;
    }
}
