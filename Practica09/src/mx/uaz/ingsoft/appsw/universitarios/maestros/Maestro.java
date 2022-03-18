package src.mx.uaz.ingsoft.appsw.universitarios.maestros;
public class Maestro extends Universitario{
	public float sueldo;
	//Verificación de sueldo
	if ((sueldo < 100)&&(sueldo > 20000)){
		this.sueldo = sueldo;
	} else {
		this.sueldo = 1000.00f;
	}

	//Cosntructores
	public Maestro(String nombre, float sueldo){
		super(nombre);
	}
	public Maestro(String nombre){
		super(nombre);
		sueldo = 1000.00f;
	}

	public boolean equals(Universitario b){
		boolean result = false;
		if ((b != null) && (b instanceof Maestro)){
			Universitario b = (Maestro) a;
			//Uso de ambos atributos determin.
			if ((sueldo == b.sueldo) && ()) 
		}
	}
}