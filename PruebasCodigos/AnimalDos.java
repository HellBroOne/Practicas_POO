public class AnimalDos extends Thread{
	private String nombre;
	public AnimalDos (String nombre){
		super(nombre);
	}

	public void run(){
		for (int i = 0; i<20; i++){
			System.out.println(getName() + " " + i);
			if (getName() == "liebre"){
				try{
					this.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		System.out.println("llego "+getName());
	}

}