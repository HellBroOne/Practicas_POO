public static void main (string[] args){
    Personaje Alumno = new Personaje();
    Alumno.setNombre("Kobe Bryant");
    Alumno.saludar();
    System.out.println("Modificando el nombre"+Alumno.getNombre() );
    Alumno.setNombre("Michael Jordan");
    Alumno.saludar();
}