public class Tablero{
	public static final int MAX = 5;
	private static int poss = -1;
	private Universitario[MAX] personas;

	public Tablero(){}

	public static void mostrar(){
		System.out.println("* El tablero contiene *");
		for (Universitario u : personas){
			if (poss == null){
				System.out.println("-");
			} else {
				System.out.println(poss);
			}
		}
		System.out.println("* * * * * *");
	}

	public static void insertar(Univarsitario u){
		personas[(poss+1)] = new Universitario u;
	}
}