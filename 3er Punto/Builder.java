package com.company;
import java.util.ArrayList;
import java.util.List;

//Crear una interfaz DiskType que represente los tipos de discos que se van a tener y su contenido
interface DiskType {
    public String nombre();
    public Empaque empaque();
    public float precio();
}

interface Empaque {
    public String presentacion();
}

class CD implements Empaque {

    @Override
    public String presentacion() {
        return "CD";
    }
}

class DVD implements Empaque {

    @Override
    public String presentacion() {
        return "DVD";
    }
}

abstract class Song implements DiskType {

    @Override
    public Empaque empaque() {
        return new CD();
    }

    @Override
    public abstract float precio();
}

abstract class Movie implements DiskType {

    @Override
    public Empaque empaque() {
        return new DVD();
    }

    @Override
    public abstract float precio();
}

//Crear clases concretas para Canciones(Song) y Peliculas(Movie)

//CD con canciones de Pop
class Pop extends Song {

    @Override
    public float precio() {
        return 15000.0f;
    }

    @Override
    public String nombre() {
        return "Pop Song";
    }
}

//CD con canciones de Rock
class Rock extends Song {

    @Override
    public float precio() {
        return 20000.0f;
    }

    @Override
    public String nombre() {
        return "Rock Song";
    }
}

//Pelicula de niños
class Kids extends Movie {

    @Override
    public float precio() {
        return 90000.0f;
    }

    @Override
    public String nombre() {
        return "Kids Movie";
    }
}

//Pelicula de carreras
class Adults extends Movie {

    @Override
    public float precio() {
        return 75000.0f;
    }

    @Override
    public String nombre() {
        return "Race Movie";
    }
}

//Crear Una clase Combo con todos los items definidos

class Combo {
    private List<DiskType> items = new ArrayList<DiskType>();

    public void agregarItem(DiskType item){
        items.add(item);
    }

    public float obtenerPrecio(){
        float precio = 0.0f;

        for (DiskType item : items) {
            precio += item.precio();
        }
        return precio;
    }

    public void mostrarItems(){

        for (DiskType item : items) {
            System.out.print("Nombre del disco : " + item.nombre());
            System.out.print(", Tipo de disco : " + item.empaque().presentacion());
            System.out.println(", Precio : " + item.precio());
        }
    }
}

//Crear el constructor de Meals
class ComboBuilder {

    public Combo comboNino (){
        Combo combo = new Combo();
        combo.agregarItem(new Pop());
        combo.agregarItem(new Kids());
        return combo;
    }

    public Combo comboAdulto (){
        Combo combo = new Combo();
        combo.agregarItem(new Rock());
        combo.agregarItem(new Adults());
        return combo;
    }
}

public class Builder {
    public static void main(String[] args) {

        ComboBuilder comboBuilder = new ComboBuilder();

        Combo vegMeal = comboBuilder.comboNino();
        System.out.println("Combo niños");
        vegMeal.mostrarItems();
        System.out.println("Precio total " + vegMeal.obtenerPrecio());

        Combo nonVegMeal = comboBuilder.comboAdulto();
        System.out.println("\n\nCombo de adultos");
        nonVegMeal.mostrarItems();
        System.out.println("Precio total: " + nonVegMeal.obtenerPrecio());
    }
}
