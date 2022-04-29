package mx.uaz.ingsoft.appsw.pruebas;
import java.util.ArrayList;
import java.util.Collections;

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
		for (int i = 0; i<MXC ; i++) {
			((Alumno)u).setCalificacion(getCalifRand(), i);
		}
		System.out.println(u);
	}
 }
}