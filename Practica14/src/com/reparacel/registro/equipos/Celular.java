package com.reparacel.registro.equipos;
import com.reparacel.registro.equipos.Electronico;
public class Celular extends Electronico{
	private int numero;

	public Celular(int numero){
		super(marca, modelo);
		this.numero = numero;
	}

	public String toString(){
		 Electronico.toString()+numero;
	}
	//se le añade el numero al metodo padre
}