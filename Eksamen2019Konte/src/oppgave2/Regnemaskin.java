package oppgave2;

/**
 * Klasse som implementerer en enkel regnemaskin som kan startes i en tråd og
 * som benytter en delt ressurs av typen Kalkulator for selve utregningene.
 * Regnemaskinen legger til 2 og trekker fra 1 100000 ganger.
 *
 * @author Atle Geitung
 */
public class Regnemaskin implements Runnable {

	private Kalkulator kalkulator;

	/**
	 * Konstruktør.
	 */
	public Regnemaskin(Kalkulator kalkulator) {
		this.kalkulator = kalkulator;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			kalkulator.pluss(2);
			kalkulator.minus(1);
			System.out.println(kalkulator);
		}
	}
}