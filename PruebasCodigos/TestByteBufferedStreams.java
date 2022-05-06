import java.io.*;
public class TestByteBufferedStreams {
	public static void main(String[] args) {
		try {
			//Filereader es una clase de lector de caracteres de un archivo
			FileInputStream archivoEntrada = new FileInputStream(args[0]); //lee el archivo 1 en los argumentos
			BufferedInputStream bufInput = new BufferedInputStream(archivoEntrada);
			try {
				//FileWriter es otra clase de lectura de archivos 
				FileOutputStream archivoSalida = new FileOutputStream(args[1]); //escribe el archivo 2 en los argumentos
				BufferedOutputStream bufOutput= new BufferedOutputStream(archivoSalida);
				try {
					byte[] data = new byte[1024];
					int data_length;
					while ((data_length = archivoEntrada.read(data)) > 0){
						archivoSalida.write(data, 0, data_length);
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

/*
*/
