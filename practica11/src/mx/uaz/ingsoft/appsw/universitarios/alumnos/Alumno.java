package mx.uaz.ingsoft.appsw.universitarios.alumnos;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.utils.Calificacion;

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
		int counter = 0;
		for (Calificacion c : calificaciones) {
			return (String) (calificaciones[counter]);
		}
	}

	public float getPromedio(){
		int contador = 0; 
		for (Calificacion c : calificaciones) {
			promedio = promedio + calificaciones[contador];
			contador = contador + 1;
		}
		contador = 0; 
		return promedio;
	}

	public void setCalificacion(){
		for (Calificacion u : calificaciones) {
			u = Calificacion.CERO;
		}
		getPromedio();
	}

	public void setCalificacion(Calificacion c, int i){
		if ((i > 0) && (i < MXC)){
			calificaciones[i] = c;
		} 
		System.out.println("Imposible poner calificacion en "+i);
	}




}