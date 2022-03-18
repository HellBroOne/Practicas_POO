package src.mx.uaz.ingsoft.appsw.universitarios.alumnos;
public class Alumno extends Universitario{
	public int calificacion;
	//Constructores
	public Alumno(String nombre, int calificacion){
		super(nombre);
	}
	public Alumno(string nombre){
		super(nombre);
		calificacion = 5;
	}
	//Verificar calificacion
	if ((calificacion > 0) && (calificacion < 10)){
		this.calificacion = calificacion;
	} else {
		calificacion = 5;
	}

	public boolean equals(Object u){
		boolean resultado = false;
		if ((u != null)&&(u instanceof Alumno)){
			Universitario b = (Alumno) u;
			if ((nombre == b.nombre)&&(calificacion = b.calificacion)){
				resultado = true;
			}
		}
		return resultado;
	}

	public int hashCode(){
		return nombre * calificacion;
	}
	public String toString(int calificacion){
		return nombre + (String) calificacion;
	}


}