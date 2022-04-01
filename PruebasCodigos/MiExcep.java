public class MiExcep extends Exception{
	private int saldo;

	public MiExcep(String message, int saldo){
		super(message);
		this.saldo = saldo;
	}

	public float getSaldo(int saldo){
		return saldo;
	}
}