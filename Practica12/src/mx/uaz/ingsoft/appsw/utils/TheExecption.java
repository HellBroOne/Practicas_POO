public class TheExecption extends Exception{
	private int poss;

	public TheExecption(String msg, int poss){
		super(msg);
		this.poss = poss;
	}

	public int getPoss(int poss){
		return poss;
	}
}