package oppgave5;

public class Quiz {
	private String id; // Unik id
	private String tittel; // Hva quizen handler om
	private Map<String, Integer> svarAlternativer = new HashMap<>();

	// Nødvendige konstruktører, equals, settere og
	// gettere kan antas at finnes
	/**
	 * Legger til alternativ ved oppbygging av quiz
	 */
	 public void leggTilAlternativ(String alternativ) { ... }

	/**
	 * Øker antall stemmer for SvarAlternativ med navn lik
	 * parameteren alternativ
	 */
	 public void giStemmeTil(String alternativ) { ... }
	 
	 public String getId() {
		 return id;
	 }
}
