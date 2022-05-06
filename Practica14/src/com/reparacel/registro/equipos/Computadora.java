package com.reparacel.registro.equipos;
public class Computadora extends Electronico{
	private String micro;

	public Computadora(String marca, int modelo, String micro){
		super(marca, modelo);
		this.micro = micro;
	}

	public String toString(){
		return toString()+" "+micro;
	}
	//to string se le agrega micro

}
