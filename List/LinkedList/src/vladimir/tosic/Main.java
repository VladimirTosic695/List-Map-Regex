package vladimir.tosic;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> pekarskiProizvodi = new LinkedList<String>();

		// dodavanje u listu
		pekarskiProizvodi.add("Burek sa mesom");
		pekarskiProizvodi.add("Pita sa sirom");
		pekarskiProizvodi.add("Kroasan krem");
		pekarskiProizvodi.add("Buhtla");
		pekarskiProizvodi.add("Krofna");
		
		// dodavanje vrednosti na zadati indeks u listi
		pekarskiProizvodi.add(2, "Somun");
		
		System.out.println("Broj proizvoda: " + pekarskiProizvodi.size());
		
		boolean daLiSadrzi = pekarskiProizvodi.contains("Kroasan krem");
		if(daLiSadrzi)
			System.out.println("Imamo trazeni proizvod. To je: " + pekarskiProizvodi.get(pekarskiProizvodi.indexOf("Kroasan krem")));
		else
			System.out.println("Nemamo trazeni proizvod.");
		
		// Postavljanje vrednosti na zadati indeks i zamena prethodne
		pekarskiProizvodi.set(0, "Kifla");
		
		// Uklanjanje proizvoda preko vrednosti
		pekarskiProizvodi.remove("Pita sa sirom");
		// uklanjanje proizvoda preko indeksa
		pekarskiProizvodi.remove(3);
		
		LinkedList<String> dodatniProizvodi = new LinkedList<String>();
		
		dodatniProizvodi.add("Hleb");
		dodatniProizvodi.add("Lepinja");
		
		// spajanje dve liste u jednu (pekarskiProizvodi)
		pekarskiProizvodi.addAll(dodatniProizvodi);
		
		// brisanje liste
		dodatniProizvodi.clear();
		
		// Dohvatanje prve i poslednje vrednosti iz liste
		System.out.println("Prvi proizvod u kolekciji: " + pekarskiProizvodi.getFirst());
		System.out.println("Poslednji proizvod u kolekciji: " + pekarskiProizvodi.getLast());
		
		// Dohvatanje vrednosti iz liste od drugog do cetvrtog indeksa
		System.out.println(pekarskiProizvodi.subList(2, 4));
		
		ListIterator<String> iter = pekarskiProizvodi.listIterator();
		
		int brojac = 1;
		System.out.println("Prolazak kroz listu od prvog do poslednjeg elementa: ");
		while(iter.hasNext()) {
			System.out.println(brojac + ". " + iter.next());
			brojac++;
		}
		
		brojac--;
		System.out.println("Prolazak kroz listu od poslednjeg do prvog elementa: ");
		while(iter.hasPrevious()) {
			System.out.println(brojac + ". " +iter.previous());
			brojac--;
		}
		
	}

}
