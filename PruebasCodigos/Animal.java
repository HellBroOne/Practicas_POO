public class Animal{
	private String name;
	public Animal (String name){
		this.nombre = nombre;
	}
	///metodo err, abstracto no lleva llaves en el padre
	/*
	public abstract void emitirSonido(){
		
		System.out.println("Nada");
	}
	*/
	public abstract void emitirSonido();

	public String toString(){
		return nombre;
	}
}