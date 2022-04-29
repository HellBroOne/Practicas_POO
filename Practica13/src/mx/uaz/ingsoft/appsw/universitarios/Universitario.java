package mx.uaz.ingsoft.appsw.universitarios;
import mx.uaz.ingsoft.appsw.utils.Tablero;

public class Universitario implements Comparable<Universitario>{
	protected String nombre;
	private final int id;

	public Universitario(String nombre){
		this.nombre = nombre;
		id = Tablero.getID();
	}

	public boolean equals(Object u){
		boolean result = false;
		if ((u != null) && (u instanceof Universitario)){
			Universitario b = (Universitario) u;
			if (this.nombre.equals(b.nombre)){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		return nombre.hashCode()*7;
	}
	public String toString(){
		return nombre;
	}

	public int getId(){
		return id;
	}

	public int compareTo(Universitario o){
		if (!nombre.equals(o.nombre)){
			return nombre.compareTo(o.nombre);
		}
		return 0;
	}

}