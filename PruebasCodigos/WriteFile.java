import java.io.*;

public class WriteFile {
	public static void main (String[] args) {
// Create file
		File file = new File(args[0]);
		try {
	// Create a buffered reader to read each line from standard in.
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			// Create a print writer on this file.
			PrintWriter out = new PrintWriter(new FileWriter(file));
			File renam = new File ("C:\\Users\\Usuario\\Documents\\GitHub\\Practicas_POO\\PruebasCodigos\\miados.txt");
			String s;
			//Unas pruebas de los metodos de files
			String qneres = file.getName();
			String pathfinder = file.getPath();
			String pathfinderconskin = file.getAbsolutePath();
			System.out.println(qneres);
			System.out.println(pathfinder);
			System.out.println(pathfinderconskin);
			//Para usar este renameTo se tiene que crear un nuevo archivo de directorio 
			file.renameTo(renam);
			System.out.print("Enter file text. ");
			System.out.println("[Type ctrl-c to stop.]");
			// CONTROL D NO VALE v.... PARA DETENERLO
			// Read each input line and echo it to the screen.
			while ((s = in.readLine()) != null) {
				out.println(s);
			}
			// Close the buffered reader and the file print writer.
			in.close();
			out.close();
		} catch (IOException e) {
		// Catch any IO exceptions.
			e.printStackTrace();
		}
	}
}