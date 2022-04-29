package mx.uaz.ingsoft.appsw.pruebas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import mx.uaz.ingsoft.appsw.utils.Tablero;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import java.util.TreeSet;

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
	System.out.println("********");
	TreeSet<Universitario> natural = new TreeSet<Universitario>();
	natural.add(new Alumno("David"));
	natural.add(new Alumno("Areli"));
	natural.add(new Alumno("Emiliano"));
	natural.add(new Alumno("Maria"));
	natural.add(new Alumno("David"));
	natural.add(new Alumno("Areli"));
	natural.add(new Alumno("Emiliano"));
	natural.add(new Alumno("Maria"));
	
	for (Alumno e : natural) {
	   natural.add(e);
	   System.out.println(e);
	}
	System.out.println("********");

	TreeSet<Universitario> porId = new TreeSet<Universitario>();
	porId.add(new Alumno("David"));
	porId.add(new Alumno("Areli"));
	porId.add(new Alumno("Emiliano"));
	porId.add(new Alumno("Maria"));
	porId.add(new Alumno("David"));
	porId.add(new Alumno("Areli"));
	porId.add(new Alumno("Emiliano"));
	porId.add(new Alumno("Maria"));
	Collections.sort(porId, new SortId() );

	for (Alumno e : natural) {
	   natural.add(e);
	   System.out.println(e);
	}
	System.out.println("********");


 }
}