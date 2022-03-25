package mx.uaz.ingsoft.appsw.utils;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Tablero{
	public static final int MAX = 5;
	private static int poss = -1;
	private static Universitario[] personas = new Universitario[MAX];

	public Tablero(){}

	public static void mostrar(){
		System.out.println("* El tablero contiene *");
		for (Universitario u : personas){
			if (personas[poss+1] == null){
				System.out.println("-");
			} else {
				System.out.println(poss);
			}
		}
		System.out.println("* * * * * *");
	}

	public static void insertar(Universitario u){
		poss = -1;
		if ((poss > 0) || (poss < MAX)){
			personas[(poss+1)] = u;
		} else {
			poss = -1;
			System.out.println("Imposible insertar en "+poss);
		}
	}

	public static void insertar(Universitario u, int idx){
		poss = idx;
		if ((poss > 0) || (poss < MAX)){
			personas[poss] = u;
		} else {
			poss = -1;
			System.out.println("Imposible insertar en "+poss);
		}
	}

	public static void borrar(){
		poss = -1;
		if ((poss > 0) || (poss < MAX)){
			personas[poss] = null;
			poss = poss -1;
		} else {
			poss = -1;
			System.out.println("Imposible borrar en "+poss);
		}
	}

	public static void borrar(int idx){
		poss = idx;
		if ((poss > 0) || (poss < MAX)){
			personas[poss] = null;
		} else {
			poss = -1;
			System.out.println("Imposible borrar en "+poss);
		}
	}
}