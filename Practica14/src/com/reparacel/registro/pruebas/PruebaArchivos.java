package com.reparacel.registro.pruebas;
import java.util.Scanner;
import java.util.Properties;
import java.io.File;
import com.reparacel.registro.utils.Archivos;
//importar props y scanner
public class PruebaArchivos{
	public static void main(String[] args) {
		String ruta = System.getProperty("user.home") + System.getProperty("file.separator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el nombre del archivo: ");
		String n_archivo = sc.next();
		String file = ruta + n_archivo;
		System.out.println(file);
		File f = new File(file);
		if ( f.exists() ){
			Archivos.leerTexto(f);
			Archivos.mostrarDatos();
			Archivos.guardaDatos(ruta + "objetos.ser");
		} else {
			System.out.println("El archivo no existe.");
		}

	}
}