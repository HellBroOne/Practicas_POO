package edu.issoft.pvsz.personajes;

public class Personaje{
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida = 3;
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
    ///Decrementador de Vida
    decVida(){
        vida = vida - 1;
    }
    decVida(int dec){
        dec = 0;
        vida = vida - dec;
    }
    ///Incrementador de Vida
    addVida(){
        vida = vida + 1;
    }
    addVida(int incvida){
        incvida = 0;
        vida = vida + incvida;
    }
    
    /*
    if (vida < 0){
        this.vida = 0;
    }
    if (vida > 99){
        this.vida = 99;
    }
    */

    
}