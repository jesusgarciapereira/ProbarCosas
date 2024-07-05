package pesadillaherencias.goose;

import pesadillaherencias.shore.Bird;

public class Swan extends Bird {
	public void swim() {
		/*this.*/floatInWater();
		System.out.println(/*this.*/text);
	}
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater();
		System.out.println(other.text);
	}
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater(); // no compila
		System.out.println(other.text);  // no compila
		// Tampoco compilaría con 
				// Bird other = new Swan();
	}
}
