package mx.uaz.ingsoft.appsw.utils;
public class Tablero{
	public static final int MAX = 5;
	private static int poss = -1;
	private Universitario[] personas = new Universitario[MAX];

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
		if ((poss > 0) || (poss < MAX)){
			personas[(poss+1)] = u;
		} else {
			System.out.println("Imposible insertar en "+poss);
		}
	}

	public static void insertar(Universitario u, int idx){
		if ((poss > 0) || (poss < MAX)){
			poss = idx;
			personas[poss] = u;
		} else {
			System.out.println("Imposible insertar en "+poss);
		}
	}

	public static void borrar(){
		if ((poss > 0) || (poss < MAX)){
			personas[poss] = null;
			poss = poss -1;
		} else {
			System.out.prinln("Imposible borrar en "+poss);
		}
	}

	public static void borrar(int idx){
		if ((poss > 0) || (poss < MAX)){
			poss = idx;
			personas[poss] = null;
		} else {
			System.out.prinln("Imposible borrar en "+poss);
		}
	}
}