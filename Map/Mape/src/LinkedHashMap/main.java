package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> pijaca = new LinkedHashMap<String, Integer>();
		
		pijaca.put("Jabuka", 50);
		pijaca.put("Luk", 20);
		pijaca.put("Sljiva", 40);
		pijaca.put("Krompir", 30);
		pijaca.put("Ananas", 180);
		
		// Parovi kljuc-vrednost se semstaju u mapu redosledom kojim se unose u mapu
		System.out.println("Svi kljucevi: " + pijaca.keySet());
		System.out.println("Sve vrednosti: " + pijaca.values());
		
	
		Iterator<Entry<String, Integer>> iter = pijaca.entrySet().iterator();
		
		// Stampanje mape
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
