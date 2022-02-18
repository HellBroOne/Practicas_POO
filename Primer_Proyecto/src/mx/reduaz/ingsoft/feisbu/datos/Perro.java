package mx.reduaz.ingsoft.feisbu.datos;
///Compila al perro en la carpeta "datos"
public class Perro{
    private String raza;
    private int anios;

    public Perro(String raza, int anios){
        this.raza = raza;
        this.anios = anios;
    }

    public String getDatos(){
        return raza + " " + anios; //<-- No hay problema al concatenar strings con ints 
    }
}