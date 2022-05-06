public class Perro extends Animal implements Comparable <Perro>{
	//1 error de perro abstracto
	private boolean moquillo;
	private int patas;

	public Perro(String name, boolean moquillo){
		super(name);
		this.moquillo = moquillo;
		this.patas = patas;
	}
	//2 error de constructor, creamos constructor
	//ELEM. ABSTRACTO
	public void emitirSondio(){
		System.out.println("Ladrar");
	}

	public boolean equals(Perro p){
		boolean result = false;
		if ((super.equals(p)) && (p instanceof Perro)){
			//Aquí se usa el equals del padre, por lo tanto ya no se pregunta el null, ya que esta verificación se hace en el metodo padre
			Animal o = (Perro) p;
			if (this.name.equals(o.getName()) && moquillo == p.moquillo){
				return true;
			}
		}
		return false;
	}

	public boolean setPatas(int patas){
		boolean resultado = false;
		if ((patas>=0)&&(patas<=6)){
			this.patas = patas;
			resultado = true;
		} return resultado;
	}

	public int compareTo(Perro p){
		if (p == null){
			throw new NullPointerException();
		}
		if (name.compareTo(p.name) != 0){
			return name.compareTo(p.name);
		}
		if (name.compareTo(p.name) == 0 && moquillo == p.moquillo && patas == p.patas){
			return 0;
		}
		if (name.compareTo(p.name) == 0 && moquillo != p.moquillo && patas == p.patas){
			return 1;
		}
		return patas - p.patas;
	}

	public String toString(){
		return name+"\t"+moquillo+"\t"+patas;
	}
	
}