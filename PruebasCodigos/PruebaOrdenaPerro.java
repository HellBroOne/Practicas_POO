import java.util.TreeSet;

public class PruebaOrdenaPerro{
	public static void main(String[] args) {
		TreeSet<Perro> ts = new TreeSet<Perro>();
		ts.add(new Perro("Dido", true));
		ts.add(new Perro("Atolini", true));
		ts.add(new Perro("Bacacho", true));
		for (Perro p : ts) {
				System.out.println(p);
			}	
		}
}