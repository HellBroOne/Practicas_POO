public class PruebaMiExcep{
	public static void main(String[] args){
	  try {
         gastarSaldo(10000);
	  } catch (MiExcep e){
	      System.err.println(e.getMessage()+" "+e.getSaldo());
	  }
	}

	public static void gastarSaldo() throws MiExcep{
	    if (!(saldo>=1 && saldo <=1000)){
	       throw new MiExcep ("No es posible gastar antidad de "+saldo);
	    }
	    System.out.println("Se gasto la cantidad de "+saldo);
	}
}