package mx.uaz.ingsoft.appsw.utils;
public class TheException extends Exception{
	private int poss;

	public TheException(String msg, int poss){
		super(msg);
		this.poss = poss;
	}

	public String getMessage(String msg){
		return msg;
	}

	public int getPoss(){
		return poss;
	}

}