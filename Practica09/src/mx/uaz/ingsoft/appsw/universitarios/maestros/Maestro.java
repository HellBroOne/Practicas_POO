package src.mx.uaz.ingsoft.appsw.universitarios.maestros;
public class Maestro extends Universitario{
	public float sueldo;

	//Cosntructores
	public Maestro(String nombre, float sueldo){
		super(nombre);
	}
	public Maestro(String nombre){
		super(nombre);
		sueldo = 1000.00f;
	}

	//Verificación de sueldo
	if ((sueldo < 100.00f) && (sueldo > 20000.00f)){
		this.sueldo = sueldo;
	} else {
		this.sueldo = 1000.00f;
	}

	public boolean equals(Universitario b){
		boolean result = false;
		if ((b != null) && (b instanceof Maestro)){
			Universitario b = (Maestro) a;
			//Uso de ambos atributos determin.
			if ((sueldo == b.sueldo) && (nombre == b.nombre)){
				resultado = true;
			}
		}
		return resultado;
	}

	public int hashCode(){
		return nombre.hashCode()*((int) sueldo);
	}

	public String toString(float sueldo){
		return nombre + (String) sueldo;
	}
}