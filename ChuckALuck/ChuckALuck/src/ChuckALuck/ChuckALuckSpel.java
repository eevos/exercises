package ChuckALuck;

public class ChuckALuckSpel {
	private int ronde;
	public int totaalBedrag;
	public int inzet;
	public int getal;
	private int[] getallen;
	private Beker beker;
	
	public ChuckALuckSpel(int totaalBedrag) {
		this.ronde = 0;
		this.totaalBedrag = totaalBedrag;
		this.inzet = 0;
		this.getal = 0;
		this.getallen = new int[3];
		this.beker = new Beker(getallen.length);
	}
	
	public void speelRonde(int getal, int inzet) {
		ronde ++;
		this.inzet = inzet;
		this.getal = getal;
		if (getal >= 1 && getal <= 6) {
			getallen = beker.gooiStenen();
			checkUitslag();
		}
	}
	
	private void checkUitslag() {
		int aantal = 0;
		
		for (int i = 0; i < getallen.length; i++) {
			if (getal == getallen[i]) {
				aantal ++;
			}
		}
		
		switch(aantal) {
		case 0:
			totaalBedrag += inzet * 0;
			System.out.println("Nul keer");
		break;
		case 1:
			totaalBedrag += inzet * 1;
			System.out.println("Één keer");
		break;
		case 2:
			totaalBedrag += inzet * 2;
			System.out.println("Twee keer");
		break;
		case 3:
			totaalBedrag += inzet * 10;
			System.out.println("Drie keer");
		break;
		}
		
		inzet = 0;
	}
	
	public String toString() {
		return "Ronde: " + ronde + ", Geluksgetal: " + getal + ", Worp: " + getallen[0] + "&" + getallen[1] + "&" + getallen[2] + ", Saldo: " + totaalBedrag;
	}
}
