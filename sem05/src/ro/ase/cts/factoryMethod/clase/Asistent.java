package ro.ase.cts.factoryMethod.clase;

import ro.ase.cts.simpleFactory.PersonalSpital;

public class Asistent extends PersonalSpital{

	public Asistent(String nume, double salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Asistent [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}

	
}