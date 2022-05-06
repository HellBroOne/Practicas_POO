public class Animal{
	protected String name; //Puede ser protected
	public Animal (String name){
		this.name = name;
	}
	///metodo err, abstracto no lleva llaves en el padre
	/*
	public abstract void emitirSonido(){
		
		System.out.println("Nada");
	}
	*/
	public void emitirSonido(){
		System.out.println("Nada");
	}

	public String toString(){
		return name;
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
			if (this.name.equals(a.name)){
				result = true;
			}
		}
		return result;
	}
	public String getName(){
		return name;
	}

	//Este metodo se heredará al nieto
	public void algo(){
		System.out.println("Pertenece al super super papa");
	}
}