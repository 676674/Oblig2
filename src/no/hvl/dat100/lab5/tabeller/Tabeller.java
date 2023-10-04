package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int x = 0; x < tabell.length; x++) {
			System.out.println(x);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String convert = "[";
		for(int x = 0; x < tabell.length; x++) {

			convert += tabell[x];
			if (!(x == tabell.length - 1)) {
			convert += ",";
			}
		}
		convert += "]";
		return convert;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int t : tabell) {
			sum += t;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		
		for (int t : tabell) {
			if (t == tall) {
				return true;}
		}
		
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int position = -1;
		int counter = 0;
		for (int t : tabell) {
			if (t == tall) {
				position = counter;
			}
			counter++;
			
		}
		return position;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tabellReversed = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			tabellReversed[tabell.length - 1 - i] = tabell[i];
		}
		return tabellReversed;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int x = Integer.MIN_VALUE;
		for (int t : tabell) {
			
			if (t < x) {
				
				return false;
			}
			x = t;	
		}
		
		return true;
		}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] newTabell = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i < tabell1.length; i++) {
			newTabell[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			newTabell[i + tabell1.length] = tabell2[i];
		}
		return newTabell;
	}
	
}
