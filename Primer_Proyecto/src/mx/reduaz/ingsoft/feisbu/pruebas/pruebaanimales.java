package mx.reduaz.ingsoft.feisbu.pruebas;
import mx.reduaz.ingsoft.feisbu.datos.Perro; ///Obtiene la clase Perro en datos.

public class pruebaanimales{

    public static void main(String[] args){
        Perro p = new Perro("Tilin", 69);
        System.out.println(p.getDatos());

    }

}