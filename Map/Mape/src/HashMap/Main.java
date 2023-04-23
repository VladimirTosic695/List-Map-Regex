package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		/*
		 * Mape se koriste za čuvanje parova elemenata, koji se nazivaju ključ i
		 * vrednost. Ne mogu postojati dva ista kljuca sto ne vazi za vrednosti(one se
		 * mogu ponavljati). Mape sluze za sortiranje i pretrazivanje podataka preko
		 * kljuca i vrednosti iz mape se mogu uzeti samo preko kljuca(get metode).
		 */

		Map<String, Student> mapa = new HashMap<>();

		// Kreiranje objekata
		Student s1 = new Student("Vladimir", "Tosic", "695/12");
		Student s2 = new Student("Nikola", "Nikolic", "586/10");
		Student s3 = new Student("Pera", "Peric", "444/22");

		// Smestanje objekata u mapu
		mapa.put(s1.getIndeks(), s1);
		mapa.put(s2.getIndeks(), s2);
		mapa.put(s3.getIndeks(), s3);

		// Velicina mape
		System.out.println("Velicina mape: " + mapa.size());

		String trazeniIndeks = "695/12";

		Student saTrezenimIndeksom = mapa.get(trazeniIndeks);

		// Ispis podataka o studentu sa trazenim indeksom (kljucem)
		System.out.println(saTrezenimIndeksom.ispisStudenta());

		// Provera da li kljuc postoji u mapi i ispis podataka o studentu ako postoji
		if (mapa.containsKey("586/10")) {
			System.out.println("Student sa trazenim indeksom je: \n" + mapa.get("586/10").ispisStudenta());
		} else
			System.out.println("Nemamo studenta sa tim indeksom.");

		// Svi kljucevi u mapi
		System.out.println(mapa.keySet());

		// Zamena kljuca
		Student s4 = new Student("Stafa", "Stefic", "695/12");
		mapa.replace("695/12", s4);

		// Ispis podataka o svim studentima
		Iterator<Entry<String, Student>> iter = mapa.entrySet().iterator();
		int brojac = 1;
		while (iter.hasNext()) {
			System.out.println(brojac + ". " + iter.next().getValue().ispisStudenta());
			brojac++;
		}
		// brisanje mape
		mapa.clear();

		System.out.println(mapa.size());

	}

}
