package HashMap;

public class Student {
	
	private String ime, prezime,indeks;
	
	
	Student(){}
	
	Student(String ime, String prezime, String indeks){
		this.ime = ime;
		this.prezime = prezime;
		this.indeks = indeks;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String getIndeks() {
		return indeks;
	}
	
	public String ispisStudenta() {
		return "Ime: " + ime + "\nPrezime: " + prezime + "\nIndeks: " + indeks;
	}

}
