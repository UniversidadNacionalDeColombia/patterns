package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

//Estrategia que se va a implementar
interface Strategy {
    public String TransportStrat();
}

//Diferentes Opciones usando la misma Interfaz (Estrategia)
class TaxiOpt implements Strategy{
    @Override
    public String TransportStrat() {
        return "Taxi";
    }
}

class BusOpt implements Strategy{
    @Override
    public String TransportStrat() {
        return "Bus";
    }
}

class BiciOpt implements Strategy{
    @Override
    public String TransportStrat() {
        return "Bici";
    }
}


class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.TransportStrat();
    }
}

public class Transportation {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Mucho dinero y Poco Tiempo ");
            System.out.println("2. Poco dinero y Mucho Tiempo");
            System.out.println("3. Ni mucho dinero, ni mucho tiempo");
            System.out.println("4. Ninguno");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Context context = new Context(new TaxiOpt());
                        System.out.println("Usar como transporte: " + context.executeStrategy());
                        break;
                    case 2:
                        context = new Context(new BusOpt());
                        System.out.println("Usar como transporte: " + context.executeStrategy());
                        break;
                    case 3:
                        context = new Context(new BiciOpt());
                        System.out.println("Usar como transporte: " + context.executeStrategy());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
