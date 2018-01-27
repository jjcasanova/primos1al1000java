package primos1al1000java;

public class principal {

	public principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int fin=1000;
		boolean encontrado=false;
		System.out.println("Primos del 1 al 1000");
		for (int i=2;i<=fin;i++) {
			encontrado=false;
			for (int j=2;j<i && !encontrado;j++) {
				if (i%j==0) {
					encontrado=true;
				}
			}
			if (!encontrado) System.out.println(i);
		}
	}

}
