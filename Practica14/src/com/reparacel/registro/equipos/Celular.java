package com.reparacel.registro.equipos;
public class Celular extends Electronico{
	private int numero;

	public Celular(String marca, int modelo, int numero){
		super(marca, modelo);
		this.numero = numero;
	}

	public String toString(){
		 return toString()+" "+numero;
	}
	//se le añade el numero al metodo padre
}