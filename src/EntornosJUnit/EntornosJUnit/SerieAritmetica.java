package EntornosJUnit;

/*Definir una clase que permita representar una serie aritm�tica; una serie tal
viene caracterizada por el primer elemento de la serie y el incremento o diferencia
entre dos elementos sucesivos de la serie. Implementar un m�todo que permita calcular
la suma de los n primeros elementos de la serie (utilizar un bucle para realizar
operac��n) y otro m�todo para mostrar los n primeros t�rminos (ej. 9.10 de Aprender a
programar con Java).
*/

public class SerieAritmetica {
	
	private int a1; // primer t�rmino
	private int d; // incremento o diferencia de un t�rmino a otro
	
	
	

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public SerieAritmetica(int a1, int d){
		this.a1 = a1;
		this.d = d;
	}
	
	// m�todo para mostrar los n primeros t�rminos de la serie
	public void muestra(int n) {
		// se muestran los n primeros t�rminos de la serie
		int i;
		int an;
		
		an = a1;
		for(i = 1; i <= n; i++) {
			System.out.println("a" + i + ": " + an);
			an = an + d;
		}
	}
	
	// m�todo para sumar los n primeros t�rminos de la serie
	public int suma(int n) {
		int i, an, suma=0;
		for(i=0; i < n; i++) {
			an = a1 + (i * d);
			suma = suma + an;
		}
		return suma;
	}

}
