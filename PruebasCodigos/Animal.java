public class Animal{
	private String name; //Puede ser protected
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

	public void retroceder(){
		System.out.println("Va para atrás");
	}

	public void avanzar(){
		System.out.println("Va para adelante");
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Animal)){
			//Se pregunta el null
			Animal a = (Animal) o;
			if (this.nombre.equals(a.nombre)){
				result = true;
			}
		}
		return result;
	}
	public String getNombre(){
		return nombre;
	}

	//Este metodo se heredará al nieto
	public void algo(){
		System.out.println("Pertenece al super super papa");
	}
}