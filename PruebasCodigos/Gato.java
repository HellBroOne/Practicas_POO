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