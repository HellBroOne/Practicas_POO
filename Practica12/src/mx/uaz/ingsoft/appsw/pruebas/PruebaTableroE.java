package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class PruebaTableroE{
	public static void main(String[] args){
		Universitario[] datos =  {
			new Universitario("Antonio");
			new Maestro("Rosario", 10f);
			new Alumno("David");
			new Universitario("Aide");
			new Maestro("Cristoper", 5000f);
			new Alumno("Areli");
			new Maestro("Victor", 10f);
			new Alumno("Emiliano");
			new Universitario("Sebastian");
			new Maestro("Marcos", 5000f);
			new Alumno("Maria");
			new Universitario("Jose");
		}///####

		Tablero.mostrar();

		//ciclo
		for (int i = 0; i<Tablero.MAX; )
	}
}