package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.utils.Calificacion;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class Alumno extends Universitario{
	private static Calificacion[] calificaciones = new Calificacion[Tablero.MXC];
	private float promedio; //practica11

	//Constructores
	
	public Alumno(String nombre){
		super(nombre);
		//Este es con metodo, al igual que el del promedio
		setCalificacion();
	}
    /* Este codigo verificaba que la calificación esté en entre 0 y 10, pero ya está en la clase tablero
	public int verificarCalif(int calificacion){
		if ( (calificacion < 0) && (calificacion > 10)) {
			this.calificacion = calificacion;
		}
		else {
			calificacion = 5;
		}
		return calificacion;
	}
	*/

	public boolean equals(Object u){
		boolean result = false;
		if ((u != null)&&(u instanceof Alumno)){
			Alumno a = (Alumno) u;
			if ( (nombre == a.nombre) && (promedio == a.promedio) ){
				result = true;
			}
		}
		return result;
	}
	public int hashCode(){
		return (int) (nombre.hashCode() * promedio);
	}
	public String toString(){
		return "Alumno: "+ nombre +" "+ getCalificaciones()+" "+getPromedio();
	}

	//Metodos practica 11
	public String getCalificaciones(){
		return calificaciones[0].getCalif()+" "+calificaciones[1].getCalif()+" "+calificaciones[2].getCalif()+" "+
		calificaciones[3].getCalif()+" "+calificaciones[4].getCalif();
	}

	public float getPromedio(){
		int contador = 0; 
		for (Calificacion c : calificaciones) {
			promedio = promedio + calificaciones[contador].getCalif();
			contador = contador + 1;
		}
		promedio = promedio/Tablero.MXC;
		contador = 0; 
		return promedio;
	}

	public void setCalificacion(){
	    int contadorarray = 0; 
		for (Calificacion u : calificaciones) {
			calificaciones[contadorarray] = Calificacion.CERO;
			contadorarray = contadorarray + 1;
		}
		getPromedio();
	}

	public void setCalificacion(Calificacion c, int i){
		if ((i > 0) && (i < Tablero.MXC)){
			calificaciones[i] = c;
		} 
	}




}