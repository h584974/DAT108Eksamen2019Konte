package oppgave3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oppgave3<T> {

	public static void main(String[] args) {
		List<String> listen = Arrays.asList("9456","#65567","8888","#6969");
		Predicate<String> betingelse = s -> s.charAt(0) == '#';
		Oppgave3<String> oppg3 = new Oppgave3<String>();
		
		// b)
		listen = oppg3.filter(listen,betingelse);
		listen.forEach(s -> System.out.println(s));
		
		// c)
		// Long antall = boker.stream().filter(b -> b.getTittel().contains("Java")).count();
		
		// List<String> ingenDuplikater = boker.stream().map(b -> b.getForfatter).distinct().sorted().collect(Collectors.toList());
	}
	
	public Oppgave3() {}
	
	// a)
	public List<T> filter(List<T> liste, Predicate<T> betingelse) {
		return liste.stream().filter(betingelse).collect(Collectors.toList());
	}

}
