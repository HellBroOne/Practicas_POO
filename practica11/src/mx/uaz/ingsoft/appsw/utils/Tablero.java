package mx.uaz.ingsoft.appsw.utils;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class Tablero{
	public static final int MAX = 5;
	private static int poss = -1;
	private static Universitario[] personas = new Universitario[MAX];

	private Tablero(){}

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
	}

	public static void insertar(Universitario u){ //Sin try-catch, se solucionó creando verificaciones if-else en vez de los try-catch
		poss = poss + 1;
		if ((poss <= 0) || (poss >= MAX)){
			System.out.println("Imposible insertar en "+poss);
			poss = -1;
		} else{	
			personas[poss] = u;
		}
	}

	public static void insertar(Universitario u, int idx){
		if ((idx <= 0) || (idx >= MAX)){
				System.out.println("Imposible insertar en "+idx);
			} else {
				personas[idx] = u;
			}
		}

	public static void borrar(){
		if ((poss <= 0) || (poss >= MAX)){
				System.out.println("Imposible borrar en "+poss);
				poss = -1;
			} else {
				personas[poss] = null;
			}
		}	

	public static void borrar(int idx){
		if ((idx <= 0) || (idx >= MAX)){
				System.out.println("Imposible borrar en "+idx);
			} else {
				personas[idx] = null;
			}
		}
}