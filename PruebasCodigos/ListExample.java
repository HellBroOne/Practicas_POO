import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(5.0F);
		list.add("second"); // duplicate, is added
		list.add(4); // duplicate, is added
		System.out.println(list);
		//System.out.println(list[1]) <-- Es solo permitible en una Array, en lista NO
		System.out.println(list.get(1));
		System.out.println(list.size());
	}
}