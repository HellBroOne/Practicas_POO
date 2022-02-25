package issoft.edu.pvsz.pruebas;
import issoft.edu.pvsz.personajes.*;

//se importa la clase de personaje
public class PruebaPersonaje{
    public static void main(String[] args){
        Personaje alumno = new Personaje("Alexander");
        alumno.setNombre("Alexander");
        alumno.setEdad(200);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        alumno.getDetalle();

        Personaje alumno = new Personaje("Rosario");
        alumno.setNombre("Rosario");
        alumno.setEdad(10);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        alumno.getDetalle();

        Personaje alumno = new Personaje("Emiliano");
        alumno.setNombre("Emiliano");
        alumno.setEdad(1);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        alumno.getDetalle();

        Personaje alumno = new Personaje("Areli");
        alumno.setNombre("Areli");
        alumno.setEdad(-10);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        alumno.getDetalle();

        Personaje alumno = new Personaje("Eloy");
        alumno.setNombre("Eloy");
        alumno.setEdad(500);
        alumno.saludar();
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        alumno.getDetalle();
        //System.out.println("Modificando el nombre " + alumno.getNombre());
        //alumno.setNombre("Michael Jordan");

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