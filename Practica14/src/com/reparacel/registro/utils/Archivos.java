//imports falta el de electronico
package com.reparacel.registro.utils;
import com.reparacel.registro.equipos.Electronico;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import com.reparacel.registro.equipos.Celular;
import com.reparacel.registro.equipos.Computadora;


public class Archivos{
	private static ArrayList<Electronico> datos  = new ArrayList<Electronico>();
	//es una ArrayList, listo

	private Archivos(){}

	public static void mostrarDatos(){
		System.out.println("Contenido de la arraylist: ");
		for ( Electronico e: datos ) {
			System.out.println(e);
		}
	}

	public static void leerTexto(File archivo){
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String linea = "";
			while(( linea = br.readLine() ) != null){
				System.out.println(linea);
				String[] valores = linea.split(",");
				Computadora co = null;
				Celular ce = null;
				try{
					//String marca = valores[0];
					int modelo = Integer.parseInt(valores[1]);
					int num = Integer.parseInt(valores[2]);
					ce = new Celular(valores[0], modelo, num);
					datos.add(ce);
				} catch (NumberFormatException nex){
					//String marca = valores[0];
					int modelo = Integer.parseInt(valores[1]);
					//String micro = valores[2];
					co = new Computadora(valores[0], modelo, valores[2]);
					datos.add(co);

				} 
			}
		} catch (IOException iou){
			iou.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public static void guardaDatos(String archivo){
		if ( (datos.size() == 0) )  {
			System.out.println("*** ArrayList sin datos. ***");
		}
		try {
			FileOutputStream out = new FileOutputStream (archivo);
			ObjectOutputStream s_out = new ObjectOutputStream (out);
			for (Electronico e : datos) {
				s_out.writeObject(e);
				s_out.close();
			}

		}catch(IOException xd){
			xd.printStackTrace();
		}
		return;
	}


}
/* 
se crea un metodo leerTexto() en la clase utilitaria (todos son staticos)
recibe una variable archivo de tipo FILE, y en el cuerpo del metodo se abre un try, para
capturar una excepcion, se cierra de una vez con el catch (se captura IOException) (importar)
y hacer print del stackTrace de la excepcion dentro del try, se crea un Buffer que lea un archivo
y un lector de archivos un FileReader llamado fr que recibe de argumento a un archivo  y un BufferReader 
llamado fr que recibe un argumento filereader br. (agregar clases de fr y br)

enseguida del buffer se crea una string vacía, es decir String s = "";
despues de la string se hace un while (como en el chat), 

En archivos falta guardar datos recibe el nombre del archivo,
lee el arraylist y los va a guardar como uno de los datos del arlist

en la prueba vamos a usar properties para usarlo con el home del usuario, si el file existe, si no,
no entendi xd
*/