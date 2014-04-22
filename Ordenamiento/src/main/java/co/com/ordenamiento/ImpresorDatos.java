package co.com.ordenamiento;

public class ImpresorDatos {
	
	private IOrdenamientoStrategy ordenamientoStrategy;
	
	public ImpresorDatos(IOrdenamientoStrategy ordenamientoStrategy){
		this.ordenamientoStrategy=ordenamientoStrategy;
	}
	
	public void imprimirDatosOrdenados(int numerosOrdenar[]){
		int numerosOrdenados[]=ordenamientoStrategy.ordenar(numerosOrdenar);
		System.out.println(numerosOrdenados);
	}
}
