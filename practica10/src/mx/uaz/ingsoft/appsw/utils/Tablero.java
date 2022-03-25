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
		poss = -1;
	}

	public static void insertar(Universitario u){
		if ((poss > 0) || (poss < MAX)){
			try{
				personas[(poss+1)] = u;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible insertar en "+poss);
			}
		}
	}

	public static void insertar(Universitario u, int idx){
		poss = idx;
		if ((poss > 0) || (poss < MAX)){
			try{
				personas[poss] = u;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible insertar en "+poss);
			}
		} 
	}

	public static void borrar(){
		poss = -1;
		if ((poss > 0) || (poss < MAX)){
			try{
				personas[poss] = null;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible borrar en "+poss);
			}
			poss = poss -1;		
		}
	}

	public static void borrar(int idx){
		poss = idx;
		if ((poss > 0) || (poss < MAX)){
			try{
				personas[poss] = null;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible borrar en "+poss);
			}
		}

	}
}