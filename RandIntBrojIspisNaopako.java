
public class RandIntBrojIspisNaopako {
	public static void main(String[] args) {
		double broj = 10000 + Math.random() * (99999 - 10000 +1);
				int brojint = (int) broj;
				System.out.println(brojint);
				
				int ispis1 = brojint % 10;
				System.out.println(ispis1);
				int ispis2 = brojint % 100 / 10;
				System.out.println(ispis2);
				int ispis3 = brojint % 1000 / 100;
				System.out.println(ispis3);
				int ispis4 = brojint % 10000 / 1000;
				System.out.println(ispis4);
				int ispis5 = brojint % 100000 / 10000;
				System.out.println(ispis5);
	}

}
