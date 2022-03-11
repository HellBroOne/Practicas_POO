package edu.issoft.pvsz.personajes.buenos;
public class Planta extends Personaje{
    public char escudo;
    
    public char getEscudo(){
        return escudo;
    }
    ///Constructores importando los atributos de la clase super
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        super(nombre);
        vida = 3;
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida);
        escudo = 'A';
    }
    public Planta(String nombre){
        super(nombre);
        vida = 3;
        escudo = 'A';
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