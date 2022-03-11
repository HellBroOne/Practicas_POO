package edu.issoft.pvsz.personajes.buenos;
import edu.issoft.pvsz.personajes.Personaje;
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
    public void decVida(){
        super.decVida();
        if (escudo == 'A'){
            vida = vida - 2;
        } 
    }
    public void decVida(int dec){
        super(dec);
        super.decVida();
        if (escudo == 'A'){
            vida = vida - (dec*2);
        }
    }
    ///Incrementos
    public void addVida(){
        super.addVida();
        if (escudo == 'A'){
            vida = vida + 2;
        }
    }
    public void addVida(int incvida){
        super(incvida);
        super.addVida();
        if (escudo == 'A'){
            vida = vida + (incvida*2);
        }
    }



}