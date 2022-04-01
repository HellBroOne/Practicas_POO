public class Perro extends Animal{
	//1 error de perro abstracto
	private boolean moquillo;
	private int patas;

	public Perro(String name){
		super(name);
		this.moquillo = moquillo;
		this.patas = patas;
	}
	//2 error de constructor, creamos constructor
	//ELEM. ABSTRACTO
	public void emitirSondio(){
		System.out.println("Ladrar");
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((super.equals(o)) && (o instanceof Perro)){
			//Aquí se usa el equals del padre, por lo tanto ya no se pregunta el null, ya que esta verificación se hace en el metodo padre
			Perro p = (Perro) o;
			if (this.nombre.equals(p.getNombre()) && moquillo == p.moquillo)
		}
	}

	public boolean setPatas(int patas){
		boolean resultado = false;
		if ((patas>=0)&&(patas<=6)){
			this.patas = patas;
			resultado = true;
		} return resultado;
	}
	
}