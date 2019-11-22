package ChuckALuck;

public class MainApp {

	public static void main(String[] args) {
		ChuckALuckSpel spel = new ChuckALuckSpel(100);
		
		spel.speelRonde(1, 100);
		System.out.println(spel);
		
		spel.speelRonde(3, 200);
		System.out.println(spel);
		
		spel.speelRonde(4, 205);
		System.out.println(spel);
	}

}
