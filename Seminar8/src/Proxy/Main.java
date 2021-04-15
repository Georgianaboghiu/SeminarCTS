package Proxy;

public class Main {

	public static void main(String[] args) {
	
		OperatoriRezervari operator1=new OperatoriRezervari();
		operator1.realizeazaRezervare(2);
		ProxyOperatorRezervari proxyOperator=new ProxyOperatorRezervari(operator1, 4);
		proxyOperator.realizeazaRezervare(4);
	}

}
