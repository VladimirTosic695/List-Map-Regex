package vladimir.tosic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		String poruka = "Regularni izraz predstavlja obrazac za pretragu stringova. Regex se koristi za "
				+ "pretragu, uredjivanje i manipulaciju tekstom. Sastoji se od razlicitih karaktera "
				+ "(regularnih i specijalnih). U ovom tesktu cu uneti mejl adresu, ime i prezime kako bih "
				+ "ilustrovao na primeru izdvajanje istih."
				+ "Vladimir Tosic"
				+ " vladimir.tosic695@gmail.com";
		
		String ImePrezime = "[A-Z][a-z]+ [A-Z][a-z]+";
		Pattern sablon = Pattern.compile(ImePrezime);
		Matcher matcher = sablon.matcher(poruka);
		
		if(matcher.find()) {
			System.out.println("Ime i prezime: " + matcher.group());
		}
		
		String email = "[a-z]+\\.[a-z]+[0-9]{3}@gmail\\.com";
		Pattern sablonMejla = Pattern.compile(email);
		Matcher m = sablonMejla.matcher(poruka);
		
		if(m.find()) {
			System.out.println("Email: " + m.group());
		}
		

	}

}
