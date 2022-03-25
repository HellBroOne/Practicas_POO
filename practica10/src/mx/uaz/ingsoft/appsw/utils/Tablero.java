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
			if (u == null){
				System.out.println("-");
			} else {
				System.out.println(u);
			}
		}
		System.out.println("* * * * * *");
		//cuando se sale del ciclo foreach, se volverá al valor inicial
	}

	public static void insertar(Universitario u){
		poss = poss + 1;
		if ((poss >= 0) || (poss < MAX)){
			try{
				personas[poss] = u;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible insertar en "+poss);
				poss = -1;
			}	
		}
	}

	public static void insertar(Universitario u, int idx){
		if ((idx >= 0) || (idx < MAX)){
			try{
				personas[idx] = u;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible insertar en "+idx);
			}
		}
	}

	public static void borrar(){
		if ((poss >= 0) || (poss < MAX)){
			try{
				personas[poss] = null;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible borrar en "+poss);
				poss = -1;
			}	
		}
	}

	public static void borrar(int idx){
		if ((idx >= 0) || (idx < MAX)){
			try{
				personas[idx] = null;
			} catch (ArrayIndexOutOfBoundsException nde){
				System.err.println("Imposible borrar en "+idx);
			}
		}
	}
}