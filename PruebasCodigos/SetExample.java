//import java.util.Set;
import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(4);
		set.add(5.0F);
		set.add("second"); // duplicate, not added
		set.add(4); // duplicate, not added
		System.out.println(set);
    }
}