import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class SerializePerro {
	public SerializePerro() {
		Perro d = new Perro ("Cacho", false);
		try {
			FileOutputStream f = new FileOutputStream ("animalitos.vet");
			ObjectOutputStream s = new ObjectOutputStream (f);
			s.writeObject (d);
			s.close ();
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
	public static void main(String[] args) {
		new SerializePerro();
	}
}