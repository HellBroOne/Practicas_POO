import java.io.*;
public class TestBufferedStreams {
	public static void main(String[] args) {
		try {
			//Filereader es una clase de lector de caracteres de un archivo
			FileReader input = new FileReader(args[0]); //lee el archivo 1 en los argumentos
			BufferedReader bufInput = new BufferedReader(input);
			try {
				//FileWriter es otra clase de lectura de archivos 
				FileWriter output = new FileWriter(args[1]); //escribe el archivo 2 en los argumentos
				BufferedWriter bufOutput= new BufferedWriter(output);
				try {
					String line;
					// lee la primera linea
					line = bufInput.readLine();
					while ( line != null ) {
					// escribe la linea hacia el archivo de salida
						bufOutput.write(line, 0, line.length());
						bufOutput.newLine();
						// lee la siguiente linea
						line = bufInput.readLine();
					}
				} finally {
					bufOutput.close();
				}
			} finally {
				bufInput.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*Desc.: El codigo recibe un primer argumento en la array args, que debe de ser un
archivo de texto, la clase FileReader lee los archivos de texto que le ingresamos
así que se instancia un objeto input de la clase FileReader con valor leído por 
dicha clase en el argumento 0, para poderlo pasar a la clase BufferedReader la cual
leerá un texto de un archivo de tipo caracter, y le dara un espacio reservado en la 
memoria. Ahoira el archivo que obtenga el valor de la array args 1 será el que

Un buffer obtiene un bloque de memoria para que podamos escribirlo y para así poder
leerlo después. Es decir, reserva la memoria.
Class BufferedReader. Reads text from a character-input stream, 
buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
*/