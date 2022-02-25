package issoft.edu.pvsz.personajes;

public class Personaje{
    private String nombre;
    private int edad;

    public Personaje(String nombre){
        this.nombre = nombre;
        int edad = 0;
        
    }

    public void setNombre(String nombre){
        if (String nombre > 3) && (String nombre < 20){
        this.nombre = nombre;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO " + nombre);
    }
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if ((edad > 0) && (edad < 120)){
            this.edad = edad;
            return true;
        }
        return false;
    }
    public void getDetalle(){
        return nombre+"\t" +edad;
    }
    
}