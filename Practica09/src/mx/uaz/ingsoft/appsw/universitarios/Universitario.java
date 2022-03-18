public class Universitario{
	protected String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object u){
		boolean result = false;
		if ((u != null) && (u instanceof Universitario)){
			Universitario m = (Universitario) u;
			if (nombre == u.nombre){
				resultado = true;
			}
		}
		return resultado;
	}

	public String toString(){
		return name;
	}

}