package template.clase;

public abstract class SpectatorAbstract {

	public abstract void asejareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
	public final void intrareSpecatorStadion() {
		asejareCoada();
		prezintaBilet();
		realizareControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
}
