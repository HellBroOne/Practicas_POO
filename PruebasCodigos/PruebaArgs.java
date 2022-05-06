import java.util.Properties;
public class PruebaArgs{
	public static void main(String[] args) {
		for (int i = 0; i<args.length; i++) {
			System.out.println("args["+ i +"] is" + args[i]);
		}
		Properties props = System.getProperties();
		props.list(System.out);
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.name"));
		String rutaarchivo = System.getProperty("user.home") + "\\Documents";
		System.out.println(rutaarchivo);
	}
}