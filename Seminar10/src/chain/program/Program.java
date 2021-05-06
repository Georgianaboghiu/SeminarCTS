package chain.program;

import chain.clase.ContCredit;
import chain.clase.ContCurent;
import chain.clase.ContEconomii;
import chain.clase.Handler;
import chain.clase.RefuzaTranzactia;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handler contCredit=new ContCredit(5000);
		Handler contCurent=new ContCurent(2000);
		Handler contEconomii=new ContEconomii(2100);
		Handler refuzaPlata=new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaPlata);
		contCurent.realizeazaPlata(5050);
	}

}
