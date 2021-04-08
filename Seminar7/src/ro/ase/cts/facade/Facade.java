package ro.ase.cts.facade;

public class Facade {
public static boolean esteAptaPersoana(Persoana p) {
	
	if(p.getVarsta()>=18) {
	if(!(Politie.esteUrmaritDePolitie(p))) {
		
		if(!BirouCredite.areCredite(p)) {
			return true;
		}
		}
	}
	return false;
	}
}


