package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.utils.Calificacion;
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
		for (int i = 0; i < Tablero.MAX; i++){
			//datos[i];
			int x = (int)(Math.random()*10)+1;
			try{
				if ((i%2) == 0){
					Tablero.insertar(i);
				}
				if ((i%2) != 0){
					Tablero.insertar(i, x);
				}

			} catch (ArrayIndexOutOfBoundsException te){
				throw new TheException (System.err.println(te.getMessage()+" "+te.getPoss()));
			}
			
		}

		Tablero.mostrar();

		for (int ind; ind < 6; ind++){
			int x = (int)(Math.random()*10)+1;
			try{
				if ((i%2) == 0){
					Tablero.borrar(i);
				}
				if ((i%2) != 0){
					Tablero.borrar(i, x);
				}
			} catch (ArrayIndexOutOfBoundsException te){
				throw new TheException (System.err.println(te.getMessage()+" "+te.getPoss()));
			}
		}
		Tablero.mostrar();


	}
}