package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import static mx.uaz.ingsoft.appsw.utils.*;

public class PruebaEnum{
	public static void main (String[] args){
		Alumno a = new Alumno("Mi nombre");
		System.out.println(a);

		for (int i = 0; i<MXC; i++){
			Calificacion c = Tablero.getCalifRand();
			a.setCalificacion(c, i);
			System.out.println(a);
		}

	}
}