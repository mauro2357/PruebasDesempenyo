package unit.co.com.ordenamiento;

import org.junit.Assert;
import org.junit.Test;

import co.com.ordenamiento.QuickSort;

public class QuickSortTest {

	@Test
	public void ordenar4897(){
		int numerosOrdenar[]={4,8,9,7};
		int numerosOrdenados[]=new QuickSort().ordenar(numerosOrdenar);
		Assert.assertArrayEquals(new int[]{4,7,8,9}, numerosOrdenados);
		
	}
	
}
