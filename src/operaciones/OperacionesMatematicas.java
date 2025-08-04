package operaciones;


/**
 * Clase con operaciones matemáticas básicas.
 */

public class OperacionesMatematicas {
	 
	 	/**
	     * Realiza la multiplicación de dos enteros.
	     * @param a primer número
	     * @param b segundo número
	     * @return resultado de a * b
	     */
	    public int multiplicar(int a, int b) {
	        return a * b;
	    }
	    
		 /**
	     * Realiza la división de dos enteros.
	      * @param a dividendo
	      * @param b divisor
	      * @return resultado de a / b
	      * @throws ArithmeticException si b es cero
	     */
	    public int dividir(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("No se puede dividir por cero");
	        }
	        return a / b;
	    }
	    
}
