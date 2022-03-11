package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.Personaje;
import edu.issoft.pvsz.personajes.buenos.Planta;
import edu.issoft.pvsz.personajes.malos.Zombi;

import java.util.*;

//se importa la clase de personaje
public class PruebaPersonaje{
    public static void main(String[] args){
        int contador = 0;
        Random rnd = new Random();
        //personajes
        Personaje per01 = new Personaje("Adrian", 100);
        Personaje per02 = new Personaje("Diego");
        Planta plan01 = new Planta("Angel", 10, 'B');
        Planta plan02 = new Planta("Maria", 50);
        Planta plan03 = new Planta("Mario", 'C');
        Planta plan04 = new Planta("Silvia");
        Zombi zom01 = new Zombi("Armando", 80, false);
        Zombi zom02 = new Zombi("Areli", true);
        Zombi zom03 = new Zombi("Gerardo");
        Personaje [] personajes = {per01, per02, per03, per04, per05, per06, per07, per08, per09};
        for (Personaje p : personajes){
            contador = contador + 1;
            System.out.println(p.getDetalle());
            int randnum = rnd.nextInt(100);
            if (randnum == 0){
                randnum = rnd.nextInt(100);
            }
            if (p instanceof Planta){
                System.out.println("Soy Planta"+""+p.getescudo());
                p.addVida(randnum);

            }
            if (p instanceof Zombi){
                System.out.println("Soy Zombi"+""+p.getAtaque());
                p.decVida(randnum);
            }
            System.out.println(randnum);
            System.out.println("***Objeto "+ contador+"***");

        }
    

       
    }


/*
        
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
