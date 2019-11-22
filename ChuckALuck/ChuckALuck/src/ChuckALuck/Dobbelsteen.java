package ChuckALuck;

public class Dobbelsteen {
	public Dobbelsteen() {
		System.out.println("Dobbelsteen gemaakt");
	}
	public int gooiSteen() {
		return (int)(Math.random() * 6 + 1);
	}
}
