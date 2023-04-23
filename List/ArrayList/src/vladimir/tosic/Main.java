package vladimir.tosic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Kreiranje liste
		List<String> pekarskiProizvodi = new ArrayList<String>();

		// dodavanje u listu
		pekarskiProizvodi.add("Burek sa mesom");
		pekarskiProizvodi.add("Pita sa sirom");
		pekarskiProizvodi.add("Kroasan krem");
		pekarskiProizvodi.add("Buhtla");
		pekarskiProizvodi.add("Krofna");

		// velicina liste
		System.out.println("U pekari mozete kupiti " + pekarskiProizvodi.size() + " razlicitih proizvoda.");
		
		System.out.println("Da li imate krofnu u pekari?");

		String trazeniProizvod = "Proja";
		// metoda contains() vraca true ili false vrednost nakon provere da li se
		// odredjena vrednost
		// nalazi unutar liste (u ovom slucaju proja)
		if (pekarskiProizvodi.contains(trazeniProizvod))
			System.out.println("Imamo.");
		else {
			System.out.println("Nemamo. Proizvodi koje mozemo ponuditi su: ");
			int brojac = 0;
			for (String p : pekarskiProizvodi) {
				System.out.println(++brojac + ". " + p);
			}
		}
		// Uzimanje indeksa iz liste gde se neka vrednost nalazi
		System.out.println("Buhtla je u listi pod indeksnim brojem: " + pekarskiProizvodi.indexOf("Buhtla"));

		// Provera da li je Buhtla pod indeksnim brojem 3
		System.out.println(pekarskiProizvodi.get(3));

		// Postavljanje vrednost na indeks 3 u listu
		pekarskiProizvodi.set(3, "Strudla");

		// Stampanje liste i provera da li je buhtla zamenjena strudlom
		System.out.println(pekarskiProizvodi);

		// Kreiranje liste sa dodatnim proizvodima
		List<String> dodatniProizvodi = new ArrayList<String>();

		dodatniProizvodi.add("Hleb");
		dodatniProizvodi.add("Lepinja");
		
		// Dodavanje svih dodatnih proizvoda u pekarske proizvode
		pekarskiProizvodi.addAll(dodatniProizvodi);
		System.out.println(pekarskiProizvodi);
		
		System.out.println("Da li su pekarski proizvodi sadrze sve dodatne proizvode? " + pekarskiProizvodi.containsAll(dodatniProizvodi));

		// Uklanjanje lepinje iz liste
		pekarskiProizvodi.remove("Lepinja");

		// Brisanje svih vrednosti iz liste dodatnih proizvoda i provera da li je lista
		// prazna
		dodatniProizvodi.clear();
		System.out.println(dodatniProizvodi.isEmpty());

		// Prevodjenje vrednosti iz liste u niz
		String niz[] = new String[pekarskiProizvodi.size()];
		pekarskiProizvodi.toArray(niz);

		// Stampanje niza
		for (String n : niz) {
			System.out.print(n + "\t ");
		}

		Iterator<String> it = pekarskiProizvodi.iterator();
		System.out.println("\nProlazak kroz listu pomocu iteratora! ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	

	}

}
