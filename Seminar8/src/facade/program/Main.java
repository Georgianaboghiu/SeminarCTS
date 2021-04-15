package facade.program;

import facade.clase.Facade;

import facade.clase.Masa;

public class Main {

	public static void main(String[] args) {
//		GestionareMese gestionareMese=new GestionareMese();
//		Picolo picolo=new Picolo();
//		Masa masa=new Masa(12, 4);
//		
//		if(gestionareMese.esteMasaLibebra(masa.getCod())) {
//			if(picolo.esteDebarasata(masa.getCod())) {
//				if(picolo.areMasaServetele(masa.getCod())) {
//					System.out.println("Poftiti la masa cu codul"
//							+masa.getCod());
//				}
//				
//				else System.out.println("Mai asteptati");
//			}else
//				System.out.println("Mai asteptati");
//		}else
//			System.out.println("Mai asteptati");
		
		Masa masa=new Masa(5,10);
		if(Facade.potAsezalaMasa(masa)) {
			System.out.println("Poftiti la masa");
		}
		else {
			System.out.println("Mai asteptati");
		}
		
	}
	

}
