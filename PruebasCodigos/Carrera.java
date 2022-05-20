public class Carrera{
	public static void main(String[] args) {
		AnimalDos tortuga = new AnimalDos("Tortuga");
		AnimalDos liebre = new AnimalDos("Liebre");
		//tortuga.setPriority(9);
		tortuga.start();
		liebre.start();
	}
}
