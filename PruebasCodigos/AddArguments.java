public class AddArguments {
	public static void main(String args[]) {
			int sum = 0;
			for ( String arg : args ) {
				try{
					sum += Integer.parseInt(arg);
				}catch (NumberFormatException nfe) {
				//Aquí capturamos la excepcion en la línea que nos puede dar error
					System.err.println("Error: El programa no puede detectar "+nfe+" como un argumento int.");
				}
			}
			System.out.println("Sum = " + sum);
		}
}