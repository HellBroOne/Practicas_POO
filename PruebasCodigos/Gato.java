public class Gato extends Animal{
	private int mueblesDaniados;

	public Gato(String nombre, int mueblesDaniados){
		super(nombre);
		this.mueblesDaniados = mueblesDaniados;
	}

	//ELEM. ABSTRACTO
	public void emitirSondio(){
		System.out.println("Maullar");
	}

	public boolean equals(Object o){
		return ((super.equals(o)) && (o instanceof Gato) && mueblesDaniados == ((Gato)o).mueblesDaniados ) 
		? true : false;
	}
	//Esto es lo mismo que un metodo equals
	//NO se puede hacer un "super.super.xxx()", si no que llamar al super(abuelo) del super(padre)
}