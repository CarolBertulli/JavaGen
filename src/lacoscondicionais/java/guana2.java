package lacoscondicionais.java;

import java.util.Scanner;

public class guana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Insira seu ano de nascimento: ");
    Scanner teclado =new Scanner(System.in);
    
    int nasc =teclado.nextInt();
    int idade = 2023-nasc;
    System.out.println("Sua idade é "+idade);
    
    if (idade>=18) {
    	System.out.println("Maior de idade");
    } else {
    	System.out.println("Menor de idade");
    }
    
	}

}
