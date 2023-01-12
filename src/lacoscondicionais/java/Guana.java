package lacoscondicionais.java;

import java.util.Scanner;

public class Guana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Entre com a primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.println("Entre com a segunda nota: ");
	    float n2 = teclado.nextFloat();
	    float m = (n1+n2)/2;
	    System.out.println("Sua média foi "+m);
	    if(m>9) {
	    	System.out.println("Parabéns!!!");
	    }
	}

}
