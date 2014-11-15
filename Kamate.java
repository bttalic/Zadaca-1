public class Kamate {
	public static void main(String[] args) {
		int glavnica = 1000;

		double kamata = 0 + (Math.random()) * (15 - 0 + 1);
		System.out.print("Ovo je kamata: ");
		System.out.println(kamata);

		double rezultat = glavnica + kamata;
		System.out.print("Ovo je rezultat: ");
		System.out.println(rezultat);
	}
}
