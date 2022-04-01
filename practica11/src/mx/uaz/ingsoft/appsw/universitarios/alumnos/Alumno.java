package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import static mx.uaz.ingsoft.appsw.utils.Calificacion;

public class Alumno extends Universitario{
	private static Calificacion[] calificaciones = new Calificacion[MXC];
	private float promedio; //practica11

	//Constructores
	
	public Alumno(String nombre){
		super(nombre);
		//Este es con metodo, al igual que el del promedio
		setCalificacion();
	}

	public int verificarCalif(int calificacion){
		if ( (calificacion < 0) && (calificacion > 10)) {
			this.calificacion = calificacion;
		}
		else {
			calificacion = 5;
		}
		return calificacion;
	}


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
		return calificaciones;
	}

	public float getPromedio(){
		for (Calificacion c : calificaciones) {
			promedio = promedio + calificacion[c];
		}
		return promedio;
	}

	public setCalificacion(){
		for (Calificacion u : calificaciones) {
			u = Calificacion.CERO;
		}
		promedio.getPromedio();
	}

	public setCalificacion(Calificacion c, int i){
		if ((indice > 0) && (indice < MXC)){
			calificaciones[indice] = c;
		} 
		System.out.println("Imposible poner calificacion en "+indice);
	}




}