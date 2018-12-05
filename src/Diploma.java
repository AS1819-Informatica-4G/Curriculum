
public class Diploma {
	private String diploma;
	private int durata;
	private int votazione;
	public Diploma(String diploma, int durata, int votazione) {
		this.diploma = diploma;
		this.durata = durata;
		this.votazione = votazione;
	}
	
	public String getDiploma() {
		return diploma;
	}

	public int getDurata() {
		return durata;
	}

	public int getVotazione() {
		return votazione;
	}
	public void setVotazione(int votazione) {
		this.votazione = votazione;
	}
	
}
