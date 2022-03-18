import src.mx.uaz.ingsoft.appsw.universitarios.Universitario;
import src.mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import src.mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
package src.mx.uaz.ingsoft.appsw.pruebas;

public class PruebaIguales {
	public static void main(String[] args){
		//Arreglo
		Universitario[] personas = {new Universitario ("Rosario"), 
		new Maestro ("Sebastian", 5f), 
		new Alumno("Areli", 80), 

		new Universitario ("Rosario"), 
		new Maestro ("Sebastian", 1000f), 
		new Alumno("Areli", 5)
	    };

	    //recorre el arreglo
	    int i = 0;
	    while (i < personas.length) {
	    	for (Universitario u : personas) {

	    		//Comparaciones
	    		if (Universitario u == Persona p) {
	    			System.out.println("****"+u.toString()+" es identico a "+p.toString()+", son el mismo Objeto");
	    		}

                if (Universitario u.equals(Persona p)){
	    			System.out.println("****"+u.toString()+" es igual a "+p.toString()+", son diferentes Objetos");
	    		}

	    		if ((Universitario u.equals(Persona p) == false) && (Universitario u != Persona p)){
	    			System.out.println(u.toString()+"!="+p.toString());
	    		}
	    	}
	    }


	}
}