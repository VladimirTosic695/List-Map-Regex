package TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> pijaca = new TreeMap<String, Integer>();
		
		pijaca.put("Jabuka", 50);
		pijaca.put("Luk", 20);
		pijaca.put("Sljiva", 40);
		pijaca.put("Krompir", 30);
		pijaca.put("Ananas", 180);
		
		// Parovi kljuc-vrednost sortiraju se po kljucu (abecedno)
		// Dohvatanje vrednosti preko kljuca
		System.out.println("Cena jabuke: " + pijaca.get("Jabuka") + " dinara.");
		
		// Ispisivanje svih kljuceva mape
		System.out.println("Svi kljucevi mape: \n" + pijaca.keySet());
		
		// Ispisivanje svih vrednosti iz mape
		System.out.println("Sve vrednosti mape: \n" + pijaca.values());
		
		// Dohvatanje prvog kljuca
		System.out.println("Prvi kljuc: " + pijaca.firstKey());
		
		// Dohvatanje poslednjeg kljuca
		System.out.println("Poslednji kljuc: " + pijaca.lastKey());
		
		Iterator<java.util.Map.Entry<String, Integer>> iter = pijaca.entrySet().iterator();
		
		System.out.println("Ispisivanje kljuc - vrednost: ");
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		

	}

}
