package com.reparacel.registro.equipos;
import java.io.Serializable;
public class Electronico implements Serializable{
	protected String marca;
	protected int modelo;

	public Electronico (String marca, int modelo){
		this.marca = marca;
		this.modelo = modelo;
	}

	public  String toString(){
		return marca+" "+modelo;
	}
}