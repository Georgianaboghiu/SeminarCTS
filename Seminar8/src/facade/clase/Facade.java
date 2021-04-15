package facade.clase;

public class Facade {

	public static boolean potAsezalaMasa(Masa masa) {
		GestionareMese gestionareMese=new GestionareMese();
		Picolo picolo=new Picolo();
		if(gestionareMese.esteMasaLibebra(masa.getCod())) {
			if(picolo.esteDebarasata(masa.getCod())) {
				if(picolo.areMasaServetele(masa.getCod())) {
					return false;
				}
				
				return false;
			}return false;
		}return false;
	}
}
