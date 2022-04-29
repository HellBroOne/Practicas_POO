import java.util.Comparator;
public class SortId implements Comparator<Universitario>{
	public int compare(Alumno o1, Alumno o2){
		if ((o1 == null) || (o2 == null)){
			throw new NullPointerException;
		} 
		return o1.getId() - o2.getId();
	}
}