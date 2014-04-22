package performance.co.com.ordenamiento;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import co.com.ordenamiento.Burbuja;
import co.com.ordenamiento.ImpresorDatos;
import co.com.ordenamiento.QuickSort;

public class OrdenamientoPerformanceTest {

	@Rule
	public ContiPerfRule contipr = new ContiPerfRule();
	
	@PerfTest(invocations = 900, threads = 200)
	@Required(throughput = 100, percentile99 = 1500)
	@Test
	public void probarOrdenamientoPerformanceTest(){
		int datosOrdenar[]={2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234,2,4,6,8,43,21,456,87,43234};
		new ImpresorDatos(new QuickSort()).imprimirDatosOrdenados(datosOrdenar);
	}
	
}
