package EntornosJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuentacadenas.CuentaCadenas;

class CuentaCadenasTest {

	
	//USO METODO CONTARVOCALES
	//Se busca un espacio en blanco
	@Test
	public void CuentaVocales4() {
		CuentaCadenas cc = new CuentaCadenas();
		int resultado = cc.contarVocales(' ', "alberto tiene manzanas"); // Espacio (tecla espacio) + texto 
		assertEquals(1, resultado);
	}
	//Parece ser que al no introducir un caracter "visible" coge como caracter a buscar, la primera letra de la cadena 
	//en la que tiene que hacer la busqueda, e incluso cuenta dicho caracter para el contador 
	
	
	
	
	//********************************************************************************************************
	
	
	
	//USO METODO CONTARCADENAS
	//Otro caso será el de buscar entre mayusculas y minusculas, ver si busca la cadena tal cual
	@Test
	public void CuentaCadenastest5() {
		CuentaCadenas cc = new CuentaCadenas();
		int resultado = cc.contarCadenas("ConTar", "Contar contar ConTar CONTAR"); // nada + texto 
		assertEquals(4, resultado);
	}
	
	//Recibimos el fallo indicando ademas que esperaba 4 resultados, pero SOLO encontró 1 parecido (que es correcto) y asi 
	//vemos que el método distinguirá de mayusculas y minusculas entre la cadena
	
	
}
