import java.util.Comparator;
public class SortCosto implements Comparator<Ordenador>{
	public int compare(Ordenador o1, Ordenador o2){
		if ((o1 == null) || (o2 == null)){
			throw new NullPointerException();
		}
		if (o1.getCosto() == o2.getCosto()){
			return 0;
		}
		if (o1.getCosto() < o2.getCosto()){
			return -1;
		} else {
			return 1;
		}
	}
}