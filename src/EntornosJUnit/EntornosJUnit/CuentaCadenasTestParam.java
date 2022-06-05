package EntornosJUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//Agregamos el runWith
@RunWith(Parameterized.class)
public class CuentaCadenasTestParam { // añadimos variables a necesitar
	private String cadenab;
	private String cadenaab;
	private int contador;

	
	
	public CuentaCadenasTestParam(String cadenab, String cadenaab, int contador) { //declaramos contrsuctor con las variables
		this.cadenab = cadenab;
		this.cadenaab = cadenaab;
		this.contador = contador;
	}
	
	
	//Etiquetamos los parametros
	@Parameters
	
	//ponemos los casos seguido
	public static Collection<Object[]> cuenta(){
		return Arrays.asList(new Object[][] {{" ", "Alex Asavei", 1}, //Espacio + Espacio; comprobamos que lea espacios sin mas
			{"	", "Alex Asavei", 1}, //Tabulacion + Espacio; comprobamos que distingue entre la tabulacion (sangria) y un espacio
			{" ","Alex Asavei", 1}, //Caracter vacio (alt+0160) + espacio; comprobamos que distinga entre un caracter vacio poco usado y el espacio sin mas
			{" ", " AlexAsavei ", 2}, // Espacio + espacios en los exteriores; comprobamos que pueda leer los espacios que están a los lados, antes y despues de cadena con letras
			{"	", "Alex\tAsavei", 0}}); //Tabulacion + caracter Java tabulacion; comprobamos que las tabulaciones normales y usando el "\t"
	}
	
	//Creamos un test con las variables creadas en el constructor, comparando los resultados
	@Test
	public void ContarCadenaTest() {
		CuentaCadenas cc = new CuentaCadenas();
		int resultado = cc.contarCadenas(cadenab, cadenaab);
		assertEquals(contador, resultado);
	}

	//Se puede ver que al ejecutar, Java distingue entre los espacios especiales, dando la oportunidad de usarlo a nuestro favor en proyectos
	
}
