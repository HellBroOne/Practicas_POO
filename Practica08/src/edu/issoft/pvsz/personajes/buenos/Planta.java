package edu.issoft.pvsz.personajes.buenos;
public class Planta extends Personaje{
    private char escudo;

    public Planta(String nombre, int vida, char escudo){
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        this.nombre = nombre;
        vida = 3;
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
        escudo = 'A';
    }
    public Planta(String nombre){
        this.nombre = nombre;
        vida = 3;
        escudo = 'A';
    }

    public char getEscudo(){
        return 'A' || 'B' !! 'C';
    }
    super.getDetalle(){

    }




}