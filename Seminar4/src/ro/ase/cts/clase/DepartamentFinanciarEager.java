package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
	
	private int nrAangajati;
	private String director;
	private double salariuDeBaza;
	private static DepartamentFinanciarEager departamentFinanciarEager=
			new DepartamentFinanciarEager(10,"Popescu",3000);
	
	private DepartamentFinanciarEager(int nrAangajati, String director, double salariuDeBaza)
	{
		super();
		this.nrAangajati = nrAangajati;
		this.director = director;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance()
	{
		return departamentFinanciarEager;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAangajati=" + nrAangajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}

	public void setNrAangajati(int nrAangajati) {
		this.nrAangajati = nrAangajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}

	
}
