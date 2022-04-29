package mx.uaz.ingsoft.utils;
import java.util.Comparator;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class SortId implements Comparator<Universitario>{
	public int compare(Universitario o1, Universitario o2){
		if ((o1 == null) || (o2 == null)){
			throw new NullPointerException();
		} 
		return o1.getId() - o2.getId();
	}
}