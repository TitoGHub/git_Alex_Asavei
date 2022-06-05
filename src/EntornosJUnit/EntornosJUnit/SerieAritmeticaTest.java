package EntornosJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import serie_aritmetica.SerieAritmetica;

public class SerieAritmeticaTest {

	//USO METODO SUMA
	//El metodo permite intoducir el numero de veces que se irá sumando los n primero numeros, es decir
	//Nos deja incluir el numero en el que el FOR deberia parar
	@Test
	public void primerTermino0() {
		SerieAritmetica sa = new SerieAritmetica(1,2);
		int resultado = sa.suma(-5);//Introducimos un numero negativo ya que sigue siendo un entero
									//y comprobamos que pasa al tener i=0 y i < -5
		assertEquals(1546, resultado);
		//el resultado no deberia darse, asi que pongo un numero un poco aleatorio
	}

	//El JUnit nos da fallo indicando que esperaba de resultado un 0; es decir, el for no se pudo hacer 
	//e hizo un return del valor suma=0 antes declarado
}
