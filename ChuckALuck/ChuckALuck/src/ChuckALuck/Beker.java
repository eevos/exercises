package ChuckALuck;

public class Beker {
	//private int[] gegooid;
	private Dobbelsteen[] dobbelstenen;
	
	public Beker(int aantalDobbelstenen) {
		dobbelstenen = new Dobbelsteen[aantalDobbelstenen];
		for (int i = 0; i < dobbelstenen.length; i++) {
			dobbelstenen[i] = new Dobbelsteen();
		}
		System.out.println("Beker gemaakt");
	}

	public int[] gooiStenen() {
		final int[] gegooid = new int[3];
		for (int i = 0; i < dobbelstenen.length; i++) {
			gegooid[i] = dobbelstenen[i].gooiSteen();
		}
		return gegooid;
	}
}
