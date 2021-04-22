package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata{

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("a fost realizata plata cash pentru suma de " + sumaPlatita);
		
	}

}
