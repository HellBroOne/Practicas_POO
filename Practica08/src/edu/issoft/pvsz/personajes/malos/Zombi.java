package edu.issoft.pvsz.personajes.malos;
public class Zombi extends Personaje{
    public boolean ataque;

    public boolean getAtaque(){
        return ataque;
    };
    ///Constructores sonbi (si, con s)
    public Zombi(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque = ataque;
    }
    public Zombi(String nombre, boolean ataque){
        super(nombre);
        this.ataque = ataque;
        vida = 3;
    }
    public Zombi(String nombre){
        super(nombre, vida);
        vida = 3;
        ataque = false;
    }
    ///Metodo obtener detalles
    public getDetalle(){
        super.getDetalle() + " " + ataque;
    }
    ///Decrementos
    ///Decrementos sin atributo
    public decVida(){
        super.decVida();
        if (ataque == false){
            vida = vida - 3;
        }
    }
    public decVida(){
        super.decVida();
        if (ataque == true){
            vida = vida - 2;
        }
    }
    ///Decrementos con Atributos
    public decVida(int dec){
        super.decVida(dec);
        if (ataque == true){
            
        }
    }

}