
public class Povrsine {
	public static void main(String[] args) {
		int broj = 5;
				int povrsina = broj * broj;
				System.out.print("Povrsina kvadrata je: ");
				System.out.println(povrsina);

				int obim = broj * 4;
				System.out.print("Obim kvadrata je: ");
				System.out.println(obim);
				
				double povrsinaKrug = broj*broj*3.14;
				System.out.print("Povrsina kruga je: ");
				System.out.println(povrsinaKrug);
				
				double obimKrug = 2*broj*3.14;
				System.out.print("Obim kruga je: ");
				System.out.println(obimKrug);
				
				double ucesce = povrsinaKrug / povrsina;
				int ucesce2 = (int) ucesce;
				System.out.print("Kvadrat ucestvuje u krugu: ");
				System.out.println(ucesce2);
				
				double visina = 0.5 + (Math.random()) * (36.7 - 0.5 + 1);
				System.out.print("Visina valjka je: ");
				System.out.println(visina);
				
				double zapremina = visina * broj * broj * 3.14;
				System.out.print("Zapremina valjka je: ");
				System.out.println(zapremina);
				
	}
}
