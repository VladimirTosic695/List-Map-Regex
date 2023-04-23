package vladimir.tosic;

import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Vector<String> sport = new Vector<String>();

		String nizSportova[] = { "Kosarka", "Fudbal", "Odbojka", "Rukomet", "Tenis" };

		// dodavanje sportova u listu
		for (String s : nizSportova) {
			sport.add(s);
		}
		// Ispisivanje sportova
		System.out.println("U listi se nalazi " + sport.size() + " sportova i to su: " + sport);

		String ATPLista[] = { "Novak Djokovic", "Carlos Alcaraz", "Casper Ruud", "Daniil Medvedev",
				"Stefanos Tsitsipas" };

		// Ispitivanje da li se tenis nalazi medju sportovima u listi
		String trazeniSport = "Tenis";
		if (sport.contains(trazeniSport)) {
			System.out.println("Ovaj sport se nalazi u listi. Najbolji sportista u ovom sportu: " + ATPLista[0]);
		} else
			System.out.println("Trazeni sport nije na nasoj listi sportova.");

		System.out.println("Da li je lista prazna? " + sport.isEmpty());

		System.out.println("Prvi sport u listi: " + sport.get(0));
		System.out.println("Odbojka se nalazi na " + sport.indexOf("Odbojka") + ". indeksu u listi.");

		// Brisanje rukometa iz liste
		sport.remove("Rukomet");

		int brojac = 1;
		ListIterator<String> liter = sport.listIterator();
		System.out.println("Ispisivanje sportova uz pomoc iteratora: ");
		while (liter.hasNext()) {
			System.out.println(brojac + ". " + liter.next());
			brojac++;
		}
		brojac--;
		
		System.out.println("Ispisivanje sportova uz pomoc iteratora: ");
		while (liter.hasPrevious()) {
			System.out.println(brojac + ". " + liter.previous());
			brojac--;
		}
		
		// brisanje liste
		sport.clear();
		
		if(sport.isEmpty()) {
			System.out.println("Game over! Lista je prazna! ");
		}

	}

}
