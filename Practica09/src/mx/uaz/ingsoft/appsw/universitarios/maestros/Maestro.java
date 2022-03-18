package mx.uaz.ingsoft.appsw.universitarios.maestros;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Maestro extends Universitario{
	private float sueldo;
	//Cosntructores
	public Maestro(String nombre, float sueldo){
		super(nombre);
	}
	public Maestro(String nombre){
		super(nombre);
		sueldo = 1000.00f;
	}

	//Verificación de sueldo
	if ((sueldo < 100f) && (sueldo > 20000f)) {
		this.sueldo = sueldo;
	} else {
		this.sueldo = 1000f;
	}

	public boolean equals(Object u){
		boolean result = false;
		if ((u != null) && (u instanceof Maestro)){
			Maestro m = (Maestro) u;
			//Uso de ambos atributos determin.
			if ((sueldo == m.sueldo) && (nombre == m.nombre)){
				result = true;
			}
		}
		return result;
	}
	public int hashCode(){
		return nombre.hashCode()*((int) sueldo);
	}

	public String toString(){
		return nombre + sueldo;
	}
}