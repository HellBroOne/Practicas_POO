package edu.issoft.pvsz.personajes.buenos;
public class Planta extends Personaje{
    public char escudo;

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
        return escudo;
    }

    public String getDetalle(){
        return super.getDetalle() + " " + escudo;
    }
    ///Decrementos
    public decVida(){
        super.decVida();
        if (escudo == 'A'){
            vida = vida - 2;
        } 
    }
    public decVida(int dec){
        super.decVida();
        if (escudo == 'A'){
            vida = vida - (dec*2);
        }
    }
    ///Incrementos
    public addVida(){
        super.addVida();
        if (escudo == 'A'){
            vida = vida + 2;
        }
    }
    public addVida(){
        super.addVida();
        if (escudo == 'A'){
            vida = vida + (incvida*2);
        }
    }



}