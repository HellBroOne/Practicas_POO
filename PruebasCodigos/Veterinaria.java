public class Veterinaria{
	public static void main(String[] args){
		//Error en esto:
		//Animal a = new Animal("Chancho");
		//Las clases abstractas NO SE PUEDEN INSTANCIAR
		Animal p = new Perro("Chancho", true);
		Animal g = new Gato("Michu", 13);
		p.emitirSonido();
		g.emitirSonido();
		Animal a = new Solovino("Solodick", true);
		a.algo();

		int i = 0;
		System.out.println(i++);
		System.out.println(i);

		i = 10;
		System.out.println(i--);
		System.out.println(i);
	}
}