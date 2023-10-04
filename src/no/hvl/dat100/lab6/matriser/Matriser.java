package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		for(int[] t : matrise) {
			for( int x : t) {
				System.out.println(x);
			}
			
		}
	}

	

	// b)
	public static String tilStreng(int[][] matrise) {
		String toString = "";
		for(int[] t : matrise) {
			for( int x : t) {
				toString += x + " ";
			}
			toString += "\n";
		}
		System.out.println(toString);
		return toString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < skalertMatrise.length; i++) {
			for (int j = 0; j < skalertMatrise[i].length; j++) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
			
			
		}
		return skalertMatrise;
				
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i ++) {
			for( int j = 0; j < b.length; j++) {
				if(a[i][j] != b[i][j]) {
					return false;
				}
				
			}
		}
		return true;
			}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speilertMatrise = new int[matrise.length][matrise[0].length];
		for(int i=0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
			speilertMatrise[j][i] = matrise[i][j];
			}
		}
		
		return speilertMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] multiplisertMatrise = new int[a.length][b[0].length];
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < b[i].length; j++) {
					for(int k = 0; k < a[0].length; k++)
					multiplisertMatrise[i][j] += a[i][k] * b[k][j];
				}
				
			}
			
		
		System.out.println(multiplisertMatrise);
		return multiplisertMatrise;
	}
}
