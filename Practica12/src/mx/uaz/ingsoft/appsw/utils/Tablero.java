package mx.uaz.ingsoft.appsw.utils;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
import mx.uaz.ingsoft.appsw.utils.Calificacion;

public class Tablero{
	public static final int MAX = 5;

	public static int MXC = 5; //practica 11

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

	public static void insertar(Universitario u) throws TheExecption{ //Ahora si llevan Try-Catch los métodos insertar y borrar
		poss = poss + 1;
		if ((poss <= 0) || (poss >= MAX)){
			throw new TheException ("No es posible insertar en la posicion "+poss);
			poss = -1;
		} else{	
			personas[poss] = u;
		}
	}

	public static void insertar(Universitario u, int idx) throws TheExecption{
		if ((idx <= 0) || (idx >= MAX)){
				System.out.println("Imposible insertar en "+idx);
			} else {
				personas[idx] = u;
			}
		}

	public static void borrar() throws TheExecption{
		if ((poss <= 0) || (poss >= MAX)){
				System.out.println("Imposible borrar en "+poss);
				poss = -1;
			} else {
				personas[poss] = null;
			}
		}	

	public static void borrar(int idx) throws TheExecption{
		if ((idx <= 0) || (idx >= MAX)){
				System.out.println("Imposible borrar en "+idx);
			} else {
				personas[idx] = null;
			}
		}

	public static Calificacion getCalifRand(){
		int rand = (int)(Math.random()*10)+1;
		switch (rand){
		    case 1: return Calificacion.UNO;
		    case 2: return Calificacion.DOS;
		  	case 3: return Calificacion.TRES;
		  	case 4: return Calificacion.CUATRO;
		  	case 5: return Calificacion.CINCO;
		  	case 6: return Calificacion.SEIS;
		  	case 7: return Calificacion.SIETE;
		  	case 8: return Calificacion.OCHO;
		  	case 9: return Calificacion.NUEVE;
		  	case 10: return Calificacion.DIEZ;
		  	default: return Calificacion.CERO;
		}
	}
}