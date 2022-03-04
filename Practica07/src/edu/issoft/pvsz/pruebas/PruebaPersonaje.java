package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.*;
import java.util.Random;

//se importa la clase de personaje
public class PruebaPersonaje{
    public static void main(String[] args){
        //personajes
        Personaje per01 = new Personaje("Christopher");
        Personaje per02 = new Personaje("Aide");
        Personaje per03 = new Personaje("Rosario");
        Personaje per04 = new Personaje("Antonio");

        int n = 0;
        double m = 0.0;


        for (int i = 0; i < 1; i++){
            m = (double) (Math.random()*100);
            m = (int) m;
            System.out.println(m);
        }
        for (int i = 0; i < 1; i++){
            n = (double) (Math.random()*100);
            n = (int) n;
            System.out.println(n);
        }
        

        
        //System.out.println("Nombre: " + per04.getNombre()+" Edad: "+per04.getEdad());

        /*
        Personaje per05 = new Personaje("Eloy");
        per05.setNombre("Eloy");
        per05.setEdad(500);
        per05.saludar();
        System.out.println("Nombre: " + per05.getNombre()+" Edad: "+per05.getEdad());

        
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

        System.out.println(per01.getDetalle());
        System.out.println(per02.getDetalle());
        System.out.println(per03.getDetalle());
        System.out.println(per04.getDetalle());
        System.out.println(per05.getDetalle());
       

        System.out.println(" - - - ");
    
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
        */
    
}
} 