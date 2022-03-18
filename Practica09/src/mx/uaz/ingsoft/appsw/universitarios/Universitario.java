package mx.uaz.ingsoft.appsw.universitarios;

public class Universitario{
	protected String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object u){
		boolean resultado = false;
		if ((u != null) && (u instanceof Universitario)){
			Universitario m = (Universitario) u;
			if (nombre == m.nombre){
				resultado = true;
			}
		}
		return resultado;
	}

	public int hashCode(){
		return nombre.hashCode()*15;
	}
	public String toString(){
		return name;
	}

}