import java.util.Comparator;
public class SortCore implements Comparator<Ordenador>{
	public int compare(Ordenador o1, Ordenador o2){
		if ((o1 == null) || (o2 == null)){
			throw new NullPointerException();
		}
		return o1.getCore() - o2.getCore();
	}
}