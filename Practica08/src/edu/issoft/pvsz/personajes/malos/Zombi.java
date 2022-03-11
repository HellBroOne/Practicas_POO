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
    public void getDetalle(){
        super.getDetalle() + " " + ataque;
    }
    ///Decrementos
    ///Decrementos sin atributo
    public void decVida(){
        super.decVida();
        if (ataque == false){
            vida = vida - 3;
        }
    }
    public void decVida(){
        super.decVida();
        if (ataque == true){
            vida = vida - 2;
        }
    }
    ///Decrementos con Atributos
    public void decVida(dec){
        super.decVida(dec);
        if (ataque == false){
            vida = vida - (dec*3);
        }
    }

    public void decVida(dec){
        super.decVida(dec);
        if (ataque == true){
            vida = vida - 2;
        }
    }

    ///INCREMENTOS
    ///Incremento sin Atribs
    public void addVida(){
        super.addVida();
        if (ataque == false){
            vida = vida + 0;
        }

    }
    public void addVida(){
        super.addVida();
        if (ataque == true){
            vida = vida + 0;
        }
    }
    //Incremento con atrib
    public void addVida(vid){
        super.addVida(incvida);
        vid = super(incvida);
        if (ataque == true){
            vida = vida + (incvida *3)
        }
    }
    public void addVida(vid){
        super.addVida(incvida);
        vid = super(incvida);
        if (ataque == false){
            vida = vida + 0;
        }

    }

}