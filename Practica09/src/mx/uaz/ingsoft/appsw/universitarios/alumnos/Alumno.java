package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Alumno extends Universitario{
	private int calificacion;
	//Constructores
	public Alumno(String nombre, int calificacion){
		super(nombre);
	}
	public Alumno(String nombre){
		super(nombre);
		calificacion = 5;
	}
	//Verificar calificacion
	if ((calificacion > 0) && (calificacion < 10)) {
		this.calificacion = calificacion;
	} else {
		calificacion = 5;
	}

	public boolean equals(Object u){
		boolean result = false;
		if ((u != null)&&(u instanceof Alumno)){
			Alumno a = (Alumno) u;
			if ( (nombre == a.nombre) && (calificacion == a.calificacion) ){
				result = true;
			}
		}
		return result;
	}
	public int hashCode(){
		return nombre.hashCode() * calificacion;
	}
	public String toString(int calificacion){
		return nombre + calificacion;
	}


}