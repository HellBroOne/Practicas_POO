package edu.issoft.pvsz.pruebas;
import edu.issoft.pvsz.personajes.*;

import java.util.*;

//se importa la clase de personaje
public class PruebaPersonaje{
    public static void main(String[] args){
        //personajes
        Personaje per01 = new Personaje("Christopher");
        Personaje per02 = new Personaje("Aide");
        Personaje per03 = new Personaje("Rosario");
        Personaje per04 = new Personaje("Antonio");

        int n = 0;
        int m = 0;
        Random rnd = new Random();

        while (n >= m){
            n = rnd.nextInt(100);
            m = rnd.nextInt(100);
            for (int i = n; n < m; i++){
                int ed = rnd.nextInt(250);
                //per01.setEdad(ed);
                if (per01.setEdad(ed) == true){
                    System.out.println("Christopher"+per01.getEdad()+" se modifico la edad.");
                    }
                    System.out.println("Christopher 0 sin modificacion de edad a "+per01.getEdad());
                int ed = rnd.nextInt(250);
                break;
                    //Paso 5
                //per02.setEdad(ed);
                if (per02.setEdad(ed) == true){
                    System.out.println("Aide"+per02.getEdad()+" se modifico la edad.");
                    }
                    System.out.println("Aide 0 sin modificación de edad a "+per02.getEdad());
                break;
                //2
                //per03.setEdad(ed);
                if (per03.setEdad(ed) == true){
                    System.out.println("Rosario"+per03.getEdad()+" se modifico la edad.");
                    }
                    System.out.println("Rosario 0 sin modificacion de edad a "+per03.getEdad());
                int ed = rnd.nextInt(250);
                break;
                //paso 6
                do {
                    int ed = rnd.nextInt(250);
                    System.out.println(ed);
                    if (ed == 150){
                        System.out.println("***BINGO "+ed+"***");
                    }
            }while (!per04.setEdad(ed) == true);
        }
            
         
         per04.getDetalle();
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
} 