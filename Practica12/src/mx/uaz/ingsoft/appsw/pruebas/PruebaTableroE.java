package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.utils.TheException;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class PruebaTableroE{
	public static void main(String[] args){
		Universitario[] datos = {
			new Universitario("Antonio"),
			new Maestro("Rosario", 10f),
			new Alumno("David"),
			new Universitario("Aide"),
			new Maestro("Cristoper", 5000f),
			new Alumno("Areli"),
			new Maestro("Victor", 10f),
			new Alumno("Emiliano"),
			new Universitario("Sebastian"),
			new Maestro("Marcos", 5000f),
			new Alumno("Maria"),
			new Universitario("Jose")
		};///####

		Tablero.mostrar();

		//ciclo
		int i = 0;
		for (i = 0; i < Tablero.MAX; i++){
			int x = (int)(Math.random()*10)+1;
			try{
				if ((i%2) == 0){
					Tablero.insertar(datos[i]);
				}
				if ((i%2) != 0){
					Tablero.insertar(datos[i], x);
				}
			} catch (TheException fe){
				System.err.println(te.getMessage()+" "+te.getPoss());
			}
			
		}

		Tablero.mostrar();

		int ind = 0;
		for (ind = 0; ind < 6; ind++){
			int x = (int)(Math.random()*10)+1;
			try{
				if ((i%2) == 0){
					Tablero.borrar(datos[i]);
				}
				if ((i%2) != 0){
					Tablero.borrar(datos[i], x);
				}
			} catch (TheException fe){
				System.err.println(te.getMessage()+" "+te.getPoss());
			}
			
		}
		Tablero.mostrar();


	}
}