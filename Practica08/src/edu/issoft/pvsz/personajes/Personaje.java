package edu.issoft.pvsz.personajes;

public class Personaje{
    private String nombre;
    private int vida;

    public Personaje(String nombre){
        this.nombre = nombre;
        edad = 0;
    }
    public void setNombre(String nombre){
        if ((nombre.length() > 3) && (nombre.length() < 20)){
            this.nombre = nombre;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO " + nombre);
    }
    public int getVida(){
        return vida;
    }

    public boolean setVida(int vida){
        if ((vida > 0) && (vida < 100)) {
            this.vida = vida;
            return true;
        } else{
        return false;
        }
    }
    public String getDetalle(){
        return nombre+"\t"+vida;
    }
    
}