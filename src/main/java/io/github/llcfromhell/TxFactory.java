package io.github.llcfromhell;

import java.util.Arrays;
import java.util.List;

public class TxFactory {

	
	public static List<Tx> generateColletion() {
		return Arrays.asList(
				new Tx(1, "user A", "02-03"), 
				new Tx(2, "user B", "02-03"),
				new Tx(3, "user A", "03-04"),
				new Tx(4, "user D", "02-03"),
				new Tx(5, "user A", "03-04"),
				new Tx(6, "user C", "02-03"),
				new Tx(7, "user A", "02-03"));
	}
	
}
