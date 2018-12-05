import java.time.LocalDate;

public abstract class Voce {
	
	private String id;
	private LocalDate inizio;
	private LocalDate fine;
	String descrizione;

	public Voce() {
		
	}
	
	public Voce(String id, LocalDate inizio, LocalDate fine, String descrizione) {
		this.id = id;
		this.inizio = inizio;
		this.fine = fine;
		this.descrizione = descrizione;
	}

}
