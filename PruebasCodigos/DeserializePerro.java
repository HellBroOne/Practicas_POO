import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializePerro {
    DeserializePerro () {
        Perro d = null;
        try {
            FileInputStream f = new FileInputStream ("animalitos.vet");
            ObjectInputStream s = new ObjectInputStream (f);
            d = (Perro) s.readObject();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 System.out.println("Objeto deserializado de animalitos.vet");
 System.out.println("Perro: "+d);
}
public static void main (String args[]) {
    new DeserializePerro();
}
}