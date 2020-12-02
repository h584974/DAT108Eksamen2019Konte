package oppgave2;

public class Oppgave2 {
	
	public static void main(String...strings) {
		
		// a)
		Kalkulator kalkulator = new Kalkulator(0);
		Thread a = new Thread(new Regnemaskin(kalkulator));
		Thread b = new Thread(new Regnemaskin(kalkulator));
		a.start();
		b.start();
		
		// b)
		// Programmet er ikke trådsikkert ettersom a og b kan både legge til og trekke fra på verdien i kalkulator objektet samtidig.
		// For å gjøre programmet trådsikkert kan man gjøre verdien i kalkulator til en AtomicInteger og endre pluss og minus metodene til å bruke denne.
		// Man kan også gjøre metodene pluss og minus til synchronized, slik at kun en av disse metodene kan bli utført til enhver tid per kalkulator objekt.
		
	}

}