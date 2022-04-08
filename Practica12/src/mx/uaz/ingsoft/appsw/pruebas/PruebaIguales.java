package mx.uaz.ingsoft.appsw.pruebas;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;

public class PruebaIguales {
	public static void main(String[] args){
		//Arreglo
		Universitario[] personas = {new Universitario ("Rosario"), 
		new Maestro  ("Sebastian", 5f), 
		new Alumno ("Areli", 80), 

		new Universitario ("Rosario"), 
		new Maestro ("Sebastian", 1000.00f), 
		new Alumno("Areli", 5)
	    };

	    //recorre el arreglo
	    int i = 0;
	    while (i < personas.length) {
	    	for (Universitario u : personas) {

	    		//Comparaciones
	    		if (u == personas[i]) {
	    			System.out.println("****"+u.toString()+" es identico a "+personas[i].toString()+", son el mismo Objeto****");
	    		} else {
	    			if ( (u.equals(personas[i]) == false) || (u != personas[i]) ){
	    				System.out.println(u.toString()+"!="+personas[i].toString());
	    			}
	    		}

                if (u.equals(personas[i])){
	    			System.out.println("**"+u.toString()+" es igual a "+personas[i].toString()+", son diferentes Objetos**");
	    		} else {
	    			if ( (u.equals(personas[i]) == false) || (u != personas[i]) ){
	    				System.out.println(u.toString()+"!="+personas[i].toString());
	    			}
	    		}
	
	    	}
	    	i = i+1;
	    }


	}
}