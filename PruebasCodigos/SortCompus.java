import java.util.ArrayList;
import java.util.Collections;
import mx.uaz.ingsoft.appsw.utils.Tablero;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class SortCompus {
	public static void main(String[] args) {
		ArrayList<Ordenador> al = new ArrayList<Ordenador>();
		al.add(new Ordenador("Lenovo", 7, 16000.09f));
		al.add(new Ordenador("Dell", 7, 17000.09f));
		al.add(new Ordenador("Dell", 5, 16000.09f));
		al.add(new Ordenador("Dell", 3, 10000.09f));
		al.add(new Ordenador("HP", 7, 17800.09f));
		al.add(new Ordenador("HP", 5, 15500.09f));
		al.add(new Ordenador("HP", 3, 8000.09f));

		//Ordenar por..
		System.out.println("##### Sin orden natural #####");
		for (Ordenador o : al) {
			System.out.println(o);
		}

		System.out.println("##### Aplicando orden natural #####");
		Collections.sort(al);
		for (Ordenador o : al) {
			System.out.println(o);
		}

		System.out.println("##### Aplicando orden Core #####");
		Collections.sort(al, new SortCore());
		for (Ordenador o : al) {
			System.out.println(o);
		}

		System.out.println("##### Aplicando orden Costo #####");
		Collections.sort(al, new SortCosto());
		for (Ordenador o : al) {
			System.out.println(o);
		}
	}

}