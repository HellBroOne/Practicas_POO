package mx.uaz.ingsoft.appsw.pruebas;
import java.util.ArrayList;
import java.util.Collections;
import mx.uaz.ingsoft.appsw.utils.Tablero;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;

public class PruebaSort{
	public static void main(String[] args) {
		ArrayList<Universitario> datos = new ArrayList<Universitario>();
		datos.add(new Alumno("David"));
		datos.add(new Alumno("Areli"));
		datos.add(new Alumno("Emiliano"));
		datos.add(new Alumno("Maria"));
		datos.add(new Alumno("David"));
		datos.add(new Alumno("Areli"));
		datos.add(new Alumno("Emiliano"));
		datos.add(new Alumno("Maria"));
	
	for (Alumno u : datos) {
		for (int i = 0; i<Tablero.MXC ; i++) {
			((Alumno)u).setCalificacion(getCalifRand(), i);
		}
		System.out.println(u);
	}
 }
}