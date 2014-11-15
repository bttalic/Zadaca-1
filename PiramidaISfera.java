
public class PiramidaISfera {
	public static void main(String[] args) {
		double stranica = 0 + (Math.random()) * (50 - 0 +1);
		System.out.print("Stranica iznosi: ");
		System.out.println(stranica);
		
		double povrsinaBaze = 4 * stranica;
		System.out.print("Povrsina Baze iznosi: ");
		System.out.println(povrsinaBaze);
		
		double povrsinaTrokuta = ((stranica * stranica) * Math.sqrt(3)) / 4;
		System.out.print("Povrsina Trokuta iznosi: ");
		System.out.println(povrsinaTrokuta);
		
		double omotac = 4 * povrsinaTrokuta;
		System.out.print("Povrsina Omotaca iznosi: ");
		System.out.println(omotac);
				
		double povrsinaPiramide = povrsinaBaze + omotac;
		System.out.print("Povrsina Piramide iznosi: ");
		System.out.println(povrsinaPiramide);
		
		double dijagonala = stranica * (Math.sqrt(2));
		System.out.print("Dijagonala iznosi: ");
		System.out.println(dijagonala);
		
		double visinaPiramide = (Math.sqrt((stranica * stranica) - ((dijagonala / 2) * (dijagonala / 2))));
		System.out.print("Visina Piramide iznosi: ");
		System.out.println(visinaPiramide);
		
		double volumenPiramide = povrsinaBaze * visinaPiramide / 3;
		System.out.print("Volumen Piramide iznosi: ");
		System.out.println(volumenPiramide);
		
		double povrsinaSfere = 4 * 3.14 * (stranica * stranica);
		System.out.print("Povrsina Sfere iznosi: ");
		System.out.println(povrsinaSfere);
		
		double volumenSfere = 4 / 3 * (stranica * stranica * stranica) * 3.14;
		System.out.print("Volumen Sfere iznosi: ");
		System.out.println(volumenSfere);
	}

}
