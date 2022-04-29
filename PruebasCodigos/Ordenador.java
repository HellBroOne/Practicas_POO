public class Ordenador implements Comparable<Ordenador>{
	private String marca;
	private int core;
	private float costo;

	public Ordenador (String marca, int core, float costo){
		this.marca = marca;
		this.core = core;
		this.costo = costo;
	}

	public String toString(){
		return marca + " " + core + " " + costo;
	}

	//getters
	public String getMarca(){
		return marca;
	}
	public int getCore(){
		return core;
	}
	public float getCosto(){
		return costo;
	}
	public String getNombre(){
		return nombre;
	}

	
	public int compareTo(Ordenador o){
		if (!marca.equals(o.marca)){
			return marca.compareTo(o.marca);
		}
		if (core != o.core){
			return core - o.core;
		}
		if (costo == o.costo){
			return 0;
		}
		if (costo < o.costo){
			return -1;
		} else {
			return 1;
		}
	}
}