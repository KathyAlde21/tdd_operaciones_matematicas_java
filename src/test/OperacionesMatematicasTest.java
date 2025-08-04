package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import operaciones.OperacionesMatematicas;

class OperacionesMatematicasTest {

	//MULTIPLICACION
	 @Test
	    void testMultiplicacion() {
	        OperacionesMatematicas op = new OperacionesMatematicas();
	        int resultado = op.multiplicar(3, 4);
	        assertEquals(12, resultado, "La multiplicación de 3 * 4 debe ser 12");
	    }
	 
	 //DIVISION
	 @Test
	 void testDivision() {
	     OperacionesMatematicas op = new OperacionesMatematicas();
	     int resultado = op.dividir(10, 2);
	     assertEquals(5, resultado, "La división de 10 / 2 debe ser 5");
	 }

	 @Test
	 void testDivisionPorCero() {
	     OperacionesMatematicas op = new OperacionesMatematicas();
	     // Esperamos que la división por cero lance una excepción
	     assertThrows(ArithmeticException.class, () -> {
	         op.dividir(10, 0);
	     }, "Dividir por cero debe lanzar ArithmeticException");
	 }


}
