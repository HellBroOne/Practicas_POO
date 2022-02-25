package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.*;

//se importa la clase de personaje
public class PruebaPersonaje{
    public static void main(String[] args){
        //per01
        Personaje per01 = new Personaje("Alexander");
        per01.setNombre("Alexander");
        per01.setEdad(200);
        per01.saludar();
        System.out.println("Nombre: " + per01.getNombre()+" Edad: "+per01.getEdad());
        per01.getDetalle();

        //per02
        Personaje per02 = new Personaje("Rosario");
        per02.setNombre("Rosario");
        per02.setEdad(10);
        per02.saludar();
        System.out.println("Nombre: " + per02.getNombre()+" Edad: "+per02.getEdad());
        per02.getDetalle();

        //per03
        Personaje per03 = new Personaje("Emiliano");
        per03.setNombre("Emiliano");
        per03.setEdad(1);
        per03.saludar();
        System.out.println("Nombre: " + per03.getNombre()+" Edad: "+per03.getEdad());
        per03.getDetalle();

        //per04
        Personaje per04 = new Personaje("Areli");
        per04.setNombre("Areli");
        per04.setEdad(-10);
        per04.saludar();
        System.out.println("Nombre: " + per04.getNombre()+" Edad: "+per04.getEdad());
        per04.getDetalle();

        //per05
        Personaje per05 = new Personaje("Eloy");
        per05.setNombre("Eloy");
        per05.setEdad(500);
        per05.saludar();
        System.out.println("Nombre: " + per05.getNombre()+" Edad: "+per05.getEdad());
        per05.getDetalle();

        //otros personajes
        Personaje per06 = per05;
        per06.setNombre("Aratt Esau Juarez Luna");

        Personaje per07 = per04;
        per07.setEdad(999);

        Personaje per08 = per03;
        per08.setNombre("Hanna");

        Personaje per09 = per02;
        per09.setEdad(666);

        Personaje per10 = per01;
        per06.setNombre("Maria Aide");

        System.out.println(" - - - ");

        per01.getDetalle();
        per02.getDetalle();
        per03.getDetalle();
        per04.getDetalle();
        per05.getDetalle();
    

        Personaje alumno = new Personaje("Kal El");
        alumno.setNombre("Kal El");
        System.out.println("Modificando el nombre " + alumno.getNombre());
        alumno.setNombre("Michael Jordan");

        //Esta wea ya es pra la edad
        alumno.saludar();
        if (!alumno.setEdad(30)){
            System.out.println("Edad sin cambios.");
        }
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        System.out.println("Modificando edad en 130");
        if (!alumno.setEdad(130)){
            System.out.println("Edad sin cambio.");
        }
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
}
}