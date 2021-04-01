package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContClient client=new ContClient("Ion",19);
		
		ContClient client2=(ContClient)client.copiaza();
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		Bilet bilet1=new Bilet(0,"Arsenal","Barcelona","1Martie","1");
		Bilet bilet2=new Bilet(1,"EchipaC","EchipaD","2Martie","2");
		
		Bilet bilet3=(Bilet)bilet1.copiaza();
		bilet3.setCodBilet(12);
		bilet3.setLoc("1F");
		
		Bilet bilet4=(Bilet)bilet1.copiaza();
		bilet4.setCodBilet(13);
		bilet4.setLoc("2F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
	}

}
