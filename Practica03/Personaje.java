public class Personaje{
    private String nombre;
    private String edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(String nombre){
        return nombre;
    }
    saludar(){
        System.out.println("Hola Alumno de POO" + nombre);
    }
    
}