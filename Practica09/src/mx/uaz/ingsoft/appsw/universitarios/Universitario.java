package mx.uaz.ingsoft.appsw.universitarios;

public class Universitario{
	public String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object u){
		boolean resultado = false;
		if ((u != null) && (u instanceof Universitario)){
			Universitario b = (Universitario) u;
			if (nombre == b.nombre){
				resultado = true;
			}
		}
		return resultado;
	}

	public int hashCode(){
		return nombre.hashCode()*15;
	}
	public String toString(){
		return nombre;
	}

}