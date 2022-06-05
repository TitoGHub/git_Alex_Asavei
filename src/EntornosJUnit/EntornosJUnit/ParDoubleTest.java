package EntornosJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParDoubleTest {

	
	//Con este m�todo de buscar numero par, usando Double como variables, comprobamos si funciona correctamente
	
	//El m�todo de buscar si es par es consiguiendo un resultado "0" como resto a la division; y teniendo en cuenta que la resta de
	//un numero como por ejemplo 30.2 es 0, el m�todo espar lo leer� bien?
	@Test
	public void ParDoubletest() {
		ParDouble id = new ParDouble(30.2);
		boolean resultado = id.espar();
		assertTrue(resultado);
		//El resultado nos indica que falla y por lo tanto acierta con que los numeros con decimales no son pares
		
	}

}
