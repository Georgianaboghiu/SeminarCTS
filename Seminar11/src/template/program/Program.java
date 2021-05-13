package template.program;

import template.clase.Spectator;
import template.clase.SpectatorAbstract;
import template.clase.SpectatorVip;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spectator specator=new Spectator("Marcel");
		SpectatorAbstract specator2=new Spectator("Gigel");
		
		specator.intrareSpecatorStadion();
		specator2.intrareSpecatorStadion();
		System.out.println(" ");
		SpectatorAbstract spectatorVip=new SpectatorVip("Ionescu");
		spectatorVip.intrareSpecatorStadion();
	}

}
