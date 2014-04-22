package co.com.ordenamiento;

public class Burbuja implements IOrdenamientoStrategy{
	
	public int[] ordenar(int numerosOrdenar[]){
		int c, d, swap;
	 
	    for (c = 0; c < ( numerosOrdenar.length - 1 ); c++) {
	      for (d = 0; d < numerosOrdenar.length - c - 1; d++) {
	        if (numerosOrdenar[d] > numerosOrdenar[d+1]) /* For descending order use < */
	        {
	          swap       = numerosOrdenar[d];
	          numerosOrdenar[d]   = numerosOrdenar[d+1];
	          numerosOrdenar[d+1] = swap;
	        }
	      }
	    }
	    return numerosOrdenar;
	}

}
