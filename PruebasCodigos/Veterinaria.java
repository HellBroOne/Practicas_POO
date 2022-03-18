public class Veterinaria{
	public static void main(String[] args){
		//Error en esto:
		//Animal a = new Animal("Chancho");
		//Las clases abstractas NO SE PUEDEN INSTANCIAR
		Animal p = new Perro("Chancho", true);
		Animal g = new Gato("Michu", 13);
	}
}