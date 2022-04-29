package mx.uaz.ingsoft.appsw.universitarios;

public class Universitario{
	private String nombre;
	private int id;

	public Universitario(String nombre, int id, int contador){
		this.nombre = nombre;
		id = this.contador;
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
		return nombre.hashCode()*15;
	}
	public String toString(){
		return nombre;
	}

}