package mx.uaz.ingsoft.appsw.utils;
import java.util.Comparator;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;

public class SortId implements Comparator<Universitario>{
	public int compare(Universitario o1, Universitario o2){
		if ((o1 == null) || (o2 == null)){
			throw new NullPointerException();
		} 
		if (o1.getId()==o2.getId()){
			return 0;
		}
		if ( o1.getId() < o2.getId() ){
			return -1;
		} else {
			return 1;
		}
	}
}