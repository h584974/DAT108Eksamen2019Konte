package oppgave2;

/**
 * Klasse som implementerer håndtering av et regneoperasjoner for regnemaskinen.
 *
 * @author Atle Geitung
 */
public class Kalkulator {

	private Integer verdi;

	/**
	 * Konstruktør.
	 *
	 * @param verdi startverdi for verdi
	 */
	public Kalkulator(Integer verdi) {
		this.verdi = verdi;
	}

	/**
	 * Legger verdi til eksisterende verdi.
	 *
	 * @param verdi verdi som skal plusses til
	 */
	public synchronized void pluss(Integer verdi) {
		this.verdi += verdi;
	}

	/**
	 * Trekker verdi fra eksisterende verdi.
	 *
	 * @param verdi verdi som skal trkkes fra
	 */
	public synchronized void minus(Integer verdi) {
		this.verdi -= verdi;
	}

	@Override
	public String toString() {
		return "Kalkulator [verdi=" + verdi + "]";
	}
}